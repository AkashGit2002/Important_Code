package src;

public class Threadpriority extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<=6;i++){
            try{
                Thread.sleep(3000);
                System.out.println(i);
            }
            catch(InterruptedException e){
                System.out.println("Exception"+e);
            }
        }
    }
    public static void main(String[] args) {

        // prevent thread execution methods- sleep(),yield(),join():
        // 1. public static native
        // Methods
//        1. public static native void sleep(long millisec) throws InterruptedException
        Threadpriority obj=new Threadpriority();
        System.out.println(Thread.currentThread().getName());
        obj.start();
    }
}
