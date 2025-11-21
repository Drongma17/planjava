package codingcrack.functionalInterfacejava8;

import java.util.function.Consumer;

public interface ConsumerFunctionalInterface {

    void eatFood(int a);
}


class LunchTime{
    public static void main(String[] args) {
        Consumer<Integer> breakfast = a -> System.out.println(a *2);
        breakfast.accept(5);

        ConsumerFunctionalInterface consumefunction = a -> System.out.println(a *4);
        consumefunction.eatFood(7);

    }
}