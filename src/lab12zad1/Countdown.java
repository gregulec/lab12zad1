package lab12zad1;

public class Countdown implements Runnable{
    private final String name;
    private final int limit;

    public Countdown(String name, int limit) {
        this.name = name;
        this.limit = limit;
    }
    
    @Override
    public void run() {
       for (int i = limit; i > 0; i--) {
            System.out.println(name + ": " + i);
           try {
               Thread.sleep(1000);
           } catch (InterruptedException ex) {
               System.out.println("Exception");
           }
}
    }
    
}
