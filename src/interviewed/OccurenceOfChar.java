package interviewed;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfChar {


    public static void main(String[] args) {
        String str= "javainterviewquestionandanswer";

        Map<Character, Integer> countChar = new HashMap<>();

       for(char c: str.toCharArray()){
           if(Character.isWhitespace(c)) continue;

           countChar.put(c, countChar.getOrDefault(c, 0)+1);
       }

     for(Map.Entry<Character, Integer> map: countChar.entrySet()){
         System.out.println(map.getKey() + " == "+ map.getValue());
     }
    }
}
