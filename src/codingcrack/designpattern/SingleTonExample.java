package codingcrack.designpattern;

public class SingleTonExample {

    private static SingleTonExample singleTonExample;

    private SingleTonExample(){}


   public static SingleTonExample singleTonMethod(){
        if(singleTonExample != null){
            singleTonExample = new SingleTonExample();
        }
        return singleTonExample;
    }


}
