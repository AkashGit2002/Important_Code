package src;

public class DaeMonThread extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("if-block");
        }
        else{
            System.out.println("else-block");
        }
        System.out.println("outside-else-block");
    }

    public static void main(String[] args) {
        System.out.println("main thread");
        DaeMonThread obj=new DaeMonThread();
        obj.setDaemon(true);
        obj.start();
        System.out.println("mainok thread");
    }

}
