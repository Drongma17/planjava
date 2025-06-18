package codingcrack.chatgpt;

import java.util.HashMap;
import java.util.Map;

public class PracticeMakes {


    public static void main(String[] args) {

        String str= "Ngawang Yeshi drongma is in minnesota";
        Character secondRepeatedCharacter = findSecondRepeatedCharacter(str.toLowerCase());
        System.out.println(secondRepeatedCharacter);
    }


    public static Character findSecondRepeatedCharacter(String str){
        char[] charArray = str.toCharArray();

        Map<Character, Integer> secondRepeatChar = new HashMap<>();
       for(Character c : charArray){
           if(c !=' '){
               secondRepeatChar.put(c, secondRepeatChar.getOrDefault(c, 0)+1);
           }
       }

       int count =0;
       for(Map.Entry<Character, Integer> entry : secondRepeatChar.entrySet()){
           if(entry.getValue() > 1){
               count ++;
               if(count == 2){
                   return entry.getKey();
               }
           }
       }
       return null;
    }

}
