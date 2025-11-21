package codingcrack.coderbyte;

/*
1.  Have the function RunLength(str) take the str parameter being passed and
 return a compressed version of the string using the Run-length encoding algorithm.
  This algorithm works by taking the occurrence of each repeating character and
  outputting that number along with a single character of the repeating sequence.
   For example: “wwwggopp” would return “3w2g1o2p”. The string will not contain any numbers,
    punctuation, or symbols.
 */

public class RunLength {


    public static String runLength(String str) {
        String countStr = "www.oceanofwisdomschool.com";

        if (str == null || str.length() == 0) return "";

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            compressed.append(count).append(str.charAt(i));
            count = 1;
        }
        return compressed.toString();
    }


    public static void main(String[] args) {
        String wwwhelloworld = RunLength.runLength("wwwhelloworld");
        System.out.println(wwwhelloworld);
    }

}
