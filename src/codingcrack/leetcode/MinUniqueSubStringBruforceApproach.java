package codingcrack.leetcode;

import java.util.HashSet;
import java.util.Set;

public class MinUniqueSubStringBruforceApproach {



        public int partitionString(String s) {
            int cnt = 0;
            Set<Character> set = new HashSet<>();

            for (int i = 0; i < s.length(); i++){
                if (set.contains(s.charAt(i))){
                    set.clear();
                    cnt++;
                    set.add(s.charAt(i));
                } else {
                    set.add(s.charAt(i));
                }
            }
            cnt++;

            return cnt;
        }



    public static void main(String[] args) {
        MinUniqueSubStringBruforceApproach solution = new MinUniqueSubStringBruforceApproach();

        System.out.println(solution.partitionString("abac")); // Output: 2
        System.out.println(solution.partitionString("aabbcc")); // Output: 3
        System.out.println(solution.partitionString("abcd")); // Output: 1
    }
    }

