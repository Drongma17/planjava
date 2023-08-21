package mocktest.javatpoint;

interface Demo{
    Test makeNoice();
}

 class Test{

     public Test() {
         System.out.println("I am Constructor !!!");
     }

     static String testMethod(){
        return "hello world !!!";
    }
}


public class referenceofmethod {

    public static void main(String[] args) {

      Demo d=Test::new;
      d.makeNoice();


    }
}
