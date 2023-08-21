package reviews.clientinterview;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceOfChars {

    public static void main(String[] args) {
        frequentCount("PROGRAMING IS VERY IMPORTANT IN TODAYS LIFE");
    }



    public static void frequentCount(String str){
        str = str.replace(" ","");
        while (str.length() > 0){
            char ch = str.charAt(0);
            System.out.println(ch + " = " + countChar(str, ch));
            str = str.replace(""+ ch, "");
        }
    }

    public static int countChar(String str, char ch){
        int count =0;
        while (str.indexOf(ch) != -1){
            count ++;
            str =str.substring((str.indexOf(ch)+1));
        }
        return count;
    }

    public static void freCount(String str){
        str = str.replace(" ", "");
        System.out.println(str);
        Map freqCount = new LinkedHashMap<Character, Integer>();
        for(char ch : str.toCharArray()){
            if(freqCount.containsKey(ch)){
            freqCount.put(ch, (Integer)freqCount.get(ch) + 1);
        }else {
                freqCount.put(ch, 1);
            }
        }
        System.out.println(freqCount);
    }

}
