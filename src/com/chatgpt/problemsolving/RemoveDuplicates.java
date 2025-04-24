package com.chatgpt.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer> sortedList) {
        // Resultant list to store unique elements
        List<Integer> uniqueList = new ArrayList<>();

        // Edge case: if the input list is empty, return the empty list
        if (sortedList == null || sortedList.isEmpty()) {
            return uniqueList;
        }

        // Add the first element to the unique list
        uniqueList.add(sortedList.get(0));

        // Traverse the list and add elements that are different from the last added element
        for (int i = 1; i < sortedList.size(); i++) {
            if (!sortedList.get(i).equals(sortedList.get(i - 1))) {
                uniqueList.add(sortedList.get(i));
            }
        }

        return uniqueList;
    }

    public static void main(String[] args) {
        // Sample input: sorted list with duplicate elements
        List<Integer> sortedList = List.of(1, 1, 2, 2, 3, 4, 4, 5);

        System.out.println("Original List: " + sortedList);

        // Remove duplicates
        List<Integer> uniqueList = removeDuplicates(sortedList);

        System.out.println("List After Removing Duplicates: " + uniqueList);
    }
}