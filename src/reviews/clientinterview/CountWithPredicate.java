package reviews.clientinterview;

import java.util.function.IntPredicate;

public class CountWithPredicate {

    public static void main(String[] args) {


        IntPredicate vowels = new IntPredicate() {
            @Override
            public boolean test(int t) {
                return t == 'a' || t== 'e'|| t == 'i' || t == 'u' || t == 'o' ||
                        t == 'A' || t== 'E' || t == 'I' || t == 'U' || t== 'O';
            }
        };

        String str = "I am java programmer in the greatest country of world";
        long count = str.chars().filter(vowels).count();
        System.out.println(count);
    }
}
