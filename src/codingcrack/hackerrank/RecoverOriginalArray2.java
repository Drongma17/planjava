package codingcrack.hackerrank;

import java.util.*;

public class RecoverOriginalArray2 {


            int[] res;
            public int[] recoverArray(int[] nums) {
                int n = nums.length;
                Arrays.sort(nums);
                ArrayList<Integer> diffs = new ArrayList<>();
                int smallest = nums[0];
                for(int i = 1; i < n; i++){
                    int k =(nums[i] - smallest) / 2;
                    if((nums[i] - smallest) % 2 == 0 && k !=0){
                        diffs.add(k);
                    }
                }
                for(int k : diffs){
                    if(check(n,k,nums)) break;
                }
                return res;
            }

            public boolean check(int n, int k, int[] nums){
                res = new int[n/2];
                boolean[] visited = new boolean[n];
                int lower = 0;
                int higher = 1;
                int count = 0;
                while(lower < n){

                    if(visited[lower]){
                        lower++;
                        continue;
                    }
                    int lowerVal = nums[lower];
                    int higherVal = lowerVal + (2 * k);
                    while(higher < n){
                        if(nums[higher] == higherVal && !visited[higher]) break;
                        higher++;
                    }
                    if(higher == n) return false;
                    visited[lower] = true;
                    visited[higher] = true;
                    res[count] = lowerVal + k;
                    count++;
                    if(count == n/2) return true;
                    lower++;
                    higher++;
                }
                return false;
            }


    public static void main(String[] args) {
        RecoverOriginalArray2 rc=new RecoverOriginalArray2();
        int[] nums = {2, 10, 6, 4, 8, 12}; // Example input  2,6,10,4,8,12
        int[] original = rc.recoverArray(nums);  // 2,4,6,8,10,12

        System.out.print("Recovered Original Array: ");
        for (int num : original) {
            System.out.print(num + " ");
        }
    }
        }