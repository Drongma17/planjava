package codingcrack.udemy.ds1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindingDifferenceInTwoArray {


    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());

        for (int i : nums1) {
            s1.add(i);
        }

        for (int i : nums2) {
            s2.add(i);
        }

        for (int i : s1) {
            if (!s2.contains(i)) {
                ans.get(0).add(i);
            }
        }

        for (int i : s2) {
            if (!s1.contains(i)) {
                ans.get(1).add(i);
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] nums1 = {2, 3, 5, 6};
        int[] nums2 = {3, 4, 7, 8};
        List<List<Integer>> difference = FindingDifferenceInTwoArray.findDifference(nums1, nums2);
        for (Integer i : difference.stream().flatMap(integers -> integers.stream()).collect(Collectors.toList())) {
            System.out.print(i + " ");
        }
    }
}

