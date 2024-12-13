package mocktest.javatpoint;

import java.util.function.Consumer;

interface hello{
    void test1();
}

class ImplementHello{
      void showme(){
         System.out.println("this is the best selling price stock !!!");
     }
}

public class MethodReference2 {

    public static void main(String[] args) {
    ImplementHello ih = new ImplementHello();
    hello showme = ih::showme;
    showme.test1();
    }

}
