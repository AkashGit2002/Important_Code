package src;
import java.lang.*;
public class Newthread implements Runnable {
    public void run(){
        // Another thread name given by JVM.
        System.out.println(Thread.currentThread().getName());
        System.out.println("Inside run method");
    }

    public static void main(String[] args) {
        // main thread
        Newthread obj=new Newthread();
        Thread obj1=new Thread(obj);
        obj1.start();
        System.out.println("Start");
        System.out.println(Thread.currentThread().getName());
    }
}
