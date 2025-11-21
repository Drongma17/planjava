package eazybyte.generics;

public class GenericCodeDemo {

    public static void main(String[] args) {

        GenericPair<String, Integer> stringIntPair = new GenericPair<>("Hello", 42);
        stringIntPair.setFirst("Another String");
        stringIntPair.setSecond(123);
        String firstName = stringIntPair.getFirst();
        Integer second = stringIntPair.getSecond();
        System.out.println(firstName);
        System.out.println(second);
    }
}
