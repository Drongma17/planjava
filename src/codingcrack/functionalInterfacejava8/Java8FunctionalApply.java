package codingcrack.functionalInterfacejava8;

import java.util.function.Function;

interface Java8FunctionalApply {

    int sayHello(String A);
}

class TestFunction{
    public static void main(String[] args) {
        Function<String, Integer> stringLength = str->str.length();
        Integer ngawang = stringLength.apply("Ngawang");


        Java8FunctionalApply java8 = str -> str.length();
        int ngawangYeshi = java8.sayHello("NgawangYeshi");
        System.out.println(ngawangYeshi);

    }
}