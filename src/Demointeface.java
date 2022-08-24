package src;

interface Phone{
    void call();
    default void message(){
        System.out.println("Send message");
    }
}
class Child implements Phone{
    public void call(){
        System.out.println("Connection.....");
    }
}
public class Demointeface {
    public static void main(String[] args) {
        Phone obj=new Child();
        obj.call();
        obj.message();
    }
}
