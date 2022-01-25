package lab12zad1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab12zad1 {

    public static void main(String[] args) {        
    Thread t1 = new Thread(new Countdown("t1", 10));
    t1.start();
        try {
            t1.join();
        } catch (InterruptedException ex) {
            System.out.println("Exception");
        }
    System.out.println("Main thread run is over");   
    }
}
