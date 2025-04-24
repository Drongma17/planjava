package codingcrack.udemy.ds1;

public class ReverseWordInString {

    /*
    Reverse Words in a String
    A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
     */
        public static String reverseWords(String s) {
            String[] str = s.trim().split("\\s+");
            String out ="";
            for(int i=0; i<(str.length)/2; i++){
                String temp = str[i];
                str[i] = str[str.length-1-i];
                str[str.length-1 -i] = temp;
            }
            for(int i=0; i<str.length; i++){
                out +=str[i]+" ";
            }
            return out.trim();
        }


    public static void main(String[] args) {
        String  s = "good evening every one of my neighbour hood, Tashi delek All";
        System.out.println("input string : " + s);
        String s1 = ReverseWordInString.reverseWords(s);
        System.out.println("out put string : "+s1);
    }
}
