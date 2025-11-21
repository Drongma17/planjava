package mocktest.seniorExp;

interface Intf {
    private void log(String msg) {
        System.out.println("Log: " + msg);
    }

    // Default method using the private log method
    default void processMessage(String message) {
        log("Processing: " + message);
        // ... further processing ...
    }

    // Static method using the private log method
    static void staticLogMessage(String staticMsg) {
        // To call a private method from a static method, it needs to be made static as well
        // Or, a non-static private method can be called from a static method indirectly through an instance.
        // In this case, if 'log' is intended for static use, it should be static.
        // For demonstration, let's assume a static private method.
        // private static void staticLog(String msg) { System.out.println("Static Log: " + msg); }
        // staticLog("Static message: " + staticMsg);
    }
}

public class Main {
    public static void main(String[] args) {
        Intf myInstance = new Intf() {}; // Anonymous class implementing the interface
        myInstance.processMessage("Hello from default method");
    }
}