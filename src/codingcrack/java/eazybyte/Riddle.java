package codingcrack.java.eazybyte;

import java.util.Arrays;
import java.util.List;

public class Riddle {

    public static void main(String[] args) {
        String hello = "Hello";
        mystery(hello);
        List<String> words = Arrays.asList("Java", "8", "Rocks");
        words.forEach(Riddle::mystery);
    }


    static void mystery(String s){
     StringBuilder builder = new StringBuilder(s).reverse();
        System.out.println(builder);
    }
}
