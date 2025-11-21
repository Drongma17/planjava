package codingcrack.MultiThreads.racecondition;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerSharedCounter {

    private AtomicInteger count = new AtomicInteger(0);
    public int getCount() {
        return count.get();
    }

    public void increment() {
        count.incrementAndGet();
    }


}
