package codingcrack.hackerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllTheDuplicate {


    public static void findDuplicate(List<Integer> list){

        Set<Integer> set = new HashSet(list);

        for(Integer s: set){
            System.out.print(s +" ");
        }
    }


    public static List<Integer> findDuplicates(int[] number){
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<number.length; i++){
            int index = Math.abs(number[i]) -1;
            if(number[index] < 0)
                 result.add(index+1);
            number[index] = - number[index];
        }

        return result;

    }



public static List<Integer> uniqueMethodToFindDuplicate(int[] nums){
    HashSet<Integer> seen = new HashSet<>();
    List<Integer> result = new ArrayList<>();
    for (int num : nums) {
        if (seen.contains(num)) {
            result.add(num);
        } else {
            seen.add(num);
        }
    }
    return result;
}

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        numbers.add(5);
       findDuplicate(numbers);


        System.out.println();
        System.out.println();
        int[] listInt ={2,3,4,5,6,7,8,4,2,4,6,7,4,4,4,4};
        List<Integer> duplicates = findDuplicates(listInt);
        for(int num: duplicates){
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println();
        int[] intlist ={2,3,4,5,6,7,8,4,2,6,7,4,4,4,4};
        List<Integer> integers = uniqueMethodToFindDuplicate(intlist);
        for(int num: integers){
            System.out.print(num + " ");
        }
    }
}
