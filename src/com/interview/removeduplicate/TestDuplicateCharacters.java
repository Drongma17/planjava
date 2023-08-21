package com.interview.removeduplicate;

import java.util.*;
import java.util.stream.Collectors;

public class TestDuplicateCharacters {


    public static void main(String[] args) {

//        String st1 ="Good Morning very one";
//
//        int count;
//
//        char stList[]=st1.toCharArray();
//
//        for(int i=0; i<stList.length; i++){
//            count = 1;
//            for(int j=i+1; j<stList.length; j++){
//                if(stList[i] == stList[j] && stList[i] !=' '){
//                    count ++;
//                    stList[j] = '0';
//                }
//            }
//
//            if(count > 1 && stList[i] !='0'){
//                System.out.println(stList[i]);
//            }
//        }


       List  arraylist = new ArrayList(Arrays.asList(1,3,5,5,6,5,8,9,5,7));

//        Set set = new LinkedHashSet();
//        set.addAll(arraylist);
//        arraylist.clear();
//
//        arraylist.addAll(set);
//
//        System.out.println(arraylist);

        arraylist.stream().distinct().forEach(i-> System.out.print(i +" "));




    }
}
