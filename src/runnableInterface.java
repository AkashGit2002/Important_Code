package src;

class Interface implements Runnable{
    public void run(){
        System.out.println("thread is running...");
    }

    public static void main(String args[]){
        Interface m1=new Interface();
        Thread t1 =new Thread(m1);
        t1.start();
    }
}
