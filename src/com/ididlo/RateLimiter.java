package com.ididlo;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

public class RateLimiter {

    // Configuration
    private final long capacity; // X
    private final long refillRateNanos; // Tokens to add per nanosecond (Calculated based on Y)

    // State
    private final AtomicLong currentTokens;
    private volatile long lastRefillTimestamp;
    private final Lock lock = new ReentrantLock();

    /**
     * Constructs a Rate Limiter allowing maxRequests per timeUnitDuration of timeUnit.
     * @param maxRequests The maximum number of requests (X).
     * @param timeUnitDuration The time duration (Y).
     * @param timeUnit The unit of time (e.g., SECONDS).
     */
    public RateLimiter(long maxRequests, long timeUnitDuration, TimeUnit timeUnit) {
        this.capacity = maxRequests;
        this.currentTokens = new AtomicLong(maxRequests); // Start with a full bucket
        this.lastRefillTimestamp = System.nanoTime();

        // Calculate the rate at which tokens should be added (in tokens per nanosecond)
        // Refill rate = X / Y (in nanoseconds)
        long durationNanos = timeUnit.toNanos(timeUnitDuration);
        
        // This calculates the number of tokens to add per nanosecond.
        // For example, 100 req / 1s: rate is 0.1 tokens/ms or 1e-10 tokens/ns.
        // We will invert this to find the time needed to generate 1 token: 
        // timeToRefillOneTokenNanos = durationNanos / maxRequests.
        // To keep this simple and avoid floating point math, let's use a time-based approach
        // for replenishment calculation inside the tryAcquire method.
        this.refillRateNanos = durationNanos / maxRequests; 
    }

    /**
     * Attempts to acquire a token. This is the main rate limiting logic.
     * @return true if the request is allowed, false otherwise.
     */
    public boolean tryAcquire() {
        lock.lock();
        try {
            refillTokens();
            
            // Check if we have enough tokens
            if (currentTokens.get() > 0) {
                currentTokens.decrementAndGet();
                return true;
            } else {
                return false;
            }
        } finally {
            lock.unlock();
        }
    }

    /**
     * Calculates and adds tokens based on the time elapsed since the last refill.
     * This method must be called under lock protection.
     */
    private void refillTokens() {
        long now = System.nanoTime();
        long timeElapsed = now - lastRefillTimestamp;

        // If timeElapsed is less than the time needed to generate 1 token, do nothing
        if (timeElapsed < refillRateNanos) {
            return;
        }

        // Calculate how many tokens should have been generated
        long tokensToAdd = timeElapsed / refillRateNanos;
        
        // Update the timestamp to the "consumed" time
        lastRefillTimestamp += tokensToAdd * refillRateNanos;

        // Add tokens, but don't exceed the capacity
        long newTokens = Math.min(capacity, currentTokens.get() + tokensToAdd);
        currentTokens.set(newTokens);
    }

    /**
     * Utility method to check current token count (for testing/monitoring).
     */
    public long availableTokens() {
        // Need to lock and refill before checking the count for accuracy
        lock.lock();
        try {
            refillTokens();
            return currentTokens.get();
        } finally {
            lock.unlock();
        }
    }
}