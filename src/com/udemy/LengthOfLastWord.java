package com.udemy;

public class LengthOfLastWord {


    public static int lengthOfLastWord(String s) {
        int count = 0;
        int n = s.length();
        int i = 0;

        while (i < n) {
            if (s.charAt(i) != ' ') {
                count++;
                i++;
            } else {
                // Current char is a space
                while (i < n && s.charAt(i) == ' ') {
                    i++;
                }

                if (i == n) { // End of string
                    return count;
                } else {
                    count = 0;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {

        String s= "hello my dear friends and families";
        int i = LengthOfLastWord.lengthOfLastWord(s);
        System.out.println("length of last word is : "+i);
    }

}
