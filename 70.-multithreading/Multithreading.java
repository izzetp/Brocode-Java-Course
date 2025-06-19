
public class Multithreading {
    public static void main(String[] args) {
        
        Thread thread1 = new Thread(new MyRunnablee("PING"));
        Thread thread2 = new Thread(new MyRunnablee("PONG"));

        System.out.println("GAME START!");

        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }
        

        System.out.println("GAME OVER!");
    }
}
