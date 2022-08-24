package src;

public class copyConstructor {
    String name;
    int age;
    copyConstructor(String Sname,int Sage){
        name=Sname;
        age=Sage;
    }
    copyConstructor(copyConstructor s1){
        name=s1.name;
        age=s1.age;
    }

    public static void main(String[] args) {
        copyConstructor obj=new copyConstructor("Akash",20);
        copyConstructor obj2=new copyConstructor(obj);
        System.out.println(obj2.name+" "+obj2.age);

    }

}
