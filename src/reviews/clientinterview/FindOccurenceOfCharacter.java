package reviews.clientinterview;

public class FindOccurenceOfCharacter {

    public static void main(String[] args) {
        String str= "JAVA DEVELOPER";
        System.out.println(getCharCount(str, 'A', 'J'));

    }



    public static long getCharCount(String str, char c, char c1){
        return str.chars().filter(e->(char)e == c || (char)e == c1).count();
    }
}
