package com.ididlo;

import java.util.*;

class Interval {
    int start;
    int end;
    
    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
    
    @Override
    public String toString() {
        return "[" + start + ", " + end + "]";
    }
}

public class MergeIntervalsWithClass {
    
    public static List<Interval> mergeIntervals(List<Interval> intervals) {
        if (intervals == null || intervals.size() <= 1) {
            return intervals;
        }
        
        // Sort by start time
        intervals.sort((a, b) -> Integer.compare(a.start, b.start));
        
        List<Interval> merged = new ArrayList<>();
        Interval current = intervals.get(0);
        merged.add(current);
        
        for (Interval interval : intervals) {
            if (interval.start <= current.end) {
                // Overlapping intervals, merge them
              current.end =  current.end > interval.end ? current.end :interval.end;
             //   current.end = Math.max(current.end, interval.end);
            } else {
                // Non-overlapping interval, add to result
                current = interval;
                merged.add(current);
            }
        }
        
        return merged;
    }
    
    public static void main(String[] args) {
        List<Interval> intervals = Arrays.asList(
            new Interval(1, 3),
            new Interval(2, 6),
            new Interval(8, 10),
            new Interval(15, 18)
        );
        
        System.out.println("Original intervals: " + intervals);
        List<Interval> merged = mergeIntervals(intervals);
        System.out.println("Merged intervals: " + merged);
    }
}