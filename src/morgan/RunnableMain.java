package morgan;

public class RunnableMain {
    public static void main(String[] args) {
        // Using static method references
        Runnable runnable = RunnableRunMethodReturnVoid::staticMethod;
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
