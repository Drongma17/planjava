package com.threads.multi;

// Shared resource for synchronization
class Printer {
    // Synchronizing methods to avoid concurrent execution
    public synchronized void printNumber(int number) {
        System.out.println("Number: " + number);
    }

    public synchronized void printAlphabet(char letter) {
        System.out.println("Alphabet: " + letter);
    }
}

// Thread class for printing numbers
class NumberPrinter extends Thread {
    Printer printer;
    
    public NumberPrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            printer.printNumber(i);
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Number thread interrupted.");
            }
        }
    }
}

// Runnable implementation for printing alphabets
class AlphabetPrinter implements Runnable {
    Printer printer;
    
    public AlphabetPrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            printer.printAlphabet(c);
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Alphabet thread interrupted.");
            }
        }
    }
}

// Main class
public class MultithreadExample {
    public static void main(String[] args) {
        // Shared printer object for synchronization
        Printer printer = new Printer();

        // Creating threads
        NumberPrinter numberThread = new NumberPrinter(printer); // Using Thread class
        Thread alphabetThread = new Thread(new AlphabetPrinter(printer)); // Using Runnable

        // Starting threads
        numberThread.start();
        alphabetThread.start();

        // Waiting for threads to complete
        try {
            numberThread.join();
            alphabetThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Both threads have finished execution.");
    }
}