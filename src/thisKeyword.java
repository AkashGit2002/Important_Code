package src;

public class thisKeyword {
    int p=10;
    void m1(int k){
        System.out.println("In parent class"+k);
    }
}

class Ab extends thisKeyword{
    int p=18;
    void m1(int k){
        System.out.println("In child class"+k);
        System.out.println(this.p); // this keyword
    }
    void show(){
        this.m1(8);
    }
    public static void main(String[] args) {
        Ab obj=new Ab();
        obj.show();
    }
}
