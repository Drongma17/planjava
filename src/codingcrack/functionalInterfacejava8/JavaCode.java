package codingcrack.functionalInterfacejava8;

interface AddNumber{
    int add(int a, int b);
}


public class JavaCode {

    public static void main(String[] args) {
      AddNumber addNumber = (a, b) -> a + b;
        int add = addNumber.add(3, 6);
        System.out.println(add);
    }


}
