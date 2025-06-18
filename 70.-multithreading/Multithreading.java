public class Multithreading {
    public static void main(String[] args) {
        
        MyRunnablee myRunnable = new MyRunnablee();
        Thread thread = new Thread(new myRunnable);
        thread.start();
    }
}
