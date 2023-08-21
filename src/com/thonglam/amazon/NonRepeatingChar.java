package com.thonglam.amazon;

public class NonRepeatingChar {


    char firstNotRepeatingCharacter(String s) {
        for (int i = 0; i < s.length(); i++) {
            boolean seenDuplicate = false;
            for (int j = 0; j < s.length(); j++){
                if (s.charAt(i) == s.charAt(j) && (i !=j)){
                    seenDuplicate = true;
                    break;
                }
            }
            if (!seenDuplicate)
                return s.charAt(i);
        }
        return '-';
    }

    public static void main(String[] args) {
        NonRepeatingChar nonRepeatingChar=new NonRepeatingChar();
       char c= nonRepeatingChar.firstNotRepeatingCharacter("aaabbcccdedfeef");
        System.out.println(c);

    }
}
