package com.interview.javatechie.exceptions;



import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ExceptionHandling1 {
    public static void main(String[] args) {
        List<String> ls= Arrays.asList("44", "55", "98", "xyz");
        List<Integer> lis1 = Arrays.asList(1,2,4,5,0);

      //  lis1.forEach(handleGenericException(s-> System.out.println(10/s), ArithmeticException.class));

        lis1.forEach(handleCheckedExceptionConsumer(i->{
            Thread.sleep(i);
            System.out.println(i);
        }));
      //  List<Integer> intlist = ls.stream().map(Integer::parseInt).collect(Collectors.toList());
        // System.out.println(intlist);



//        ls.forEach(s-> {
//            try {
//                System.out.println(Integer.parseInt(s));
//            }catch (Exception e){
//                System.out.println("Exception : " +e.getMessage());
//            }
//        });


     //   ls.forEach(handleExceptionIfAny(s-> System.out.println(Integer.parseInt(s))));

        ls.forEach(handleGenericException(s-> System.out.println(Integer.parseInt(s)), NumberFormatException.class));
    }



    static Consumer<String> handleExceptionIfAny(Consumer<String> payload){
        return obj->{
            try {
                payload.accept(obj);
            }catch (Exception ex){
                System.out.println("Exception : " +ex.getMessage());
            }
        };
    }


    static <Target, ExObj extends Exception> Consumer<Target> handleGenericException(Consumer<Target> targetConsumer,
                                                                           Class<ExObj> exObjClass){
        return obj->{
            try {
                targetConsumer.accept(obj);
            }catch (Exception ex){
                try {
                    ExObj exObj=exObjClass.cast(ex);
                    System.out.println("Exception : " +exObj.getMessage());
                }catch (ClassCastException ecx){
                   throw ex;
                }
            }
        };
    }


    static <Target> Consumer<Target> handleCheckedExceptionConsumer(CheckedExceptionHandlerConsumer<Target, Exception> handlerConsumer){
        return obj->{
            try {
                handlerConsumer.accept(obj);
            }catch (Exception ex){
                throw new RuntimeException(ex);
            }
        };
    }
}
