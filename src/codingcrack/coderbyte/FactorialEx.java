package codingcrack.coderbyte;

public class FactorialEx {


    public static int facto(int num){

        int result = 0;
        if(num == 1 || num == 0) {
            return 1;
        }else {
             result = num * facto(num - 1);
        }

      return result;

    }

    public static void main(String[] args) {

        System.out.println(FactorialEx.facto(8));

    }

}
