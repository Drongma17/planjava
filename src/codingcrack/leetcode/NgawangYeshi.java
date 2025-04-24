package codingcrack.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NgawangYeshi {

    public static List<List<Integer>>  twoArrayDifference(List<Integer> a, List<Integer> b){
        Set<Integer> s1 = new HashSet();
        Set<Integer> s2 = new HashSet();
        List<List<Integer>>  ama= new ArrayList<>();
        ama.add(new ArrayList<>());
        ama.add(new ArrayList<>());

        for(int i: s2){
            if(!s1.contains(i)){
                ama.get(0).add(i);
            }
        }

        for(int i:s1){
            if(!s2.contains(i)){
                ama.get(1).add(i);
            }
        }
        return ama;
    }


    public static void main(String[] args) {

    }
}
