package src;

//public class index1{
//   static int val;
//    public static void method(){
//        val=7;
//        System.out.println("Hello static method"+val);
//    }
//}
//class a{
//    public static void main(String[] args) {
//        index1.method();
//    }
//}
//class index2 {
//    protected static void print(){
//        System.out.println("INDEX1 CLASS");
//    }
//}
//class index extends index2 {
//    public static void main(String[] args) {
//        index2.print();
//    }
//}
class encapsulation{
    private int var1;
    public int getdata(){
        return(var1);
    }
    public void setdata(int p){
        var1=p;
    }
}
class mainclass{
    public static void main(String[] args) {
        encapsulation obj1=new encapsulation();
        obj1.setdata(15);
        System.out.println(obj1.getdata());
    }
}

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//public class index1 {
//    public static void main(String[] args) {
//        String str="abc";
//        ArrayList<String> curr=new ArrayList<>();
//        curr.add("");
//        allpermutation(str,0,str.length(),curr);
//    }
//    protected static void allpermutation(String str,int i,int n,ArrayList curr){
//        if(i==n){
//            System.out.println(curr);
//            return;
//        }
//        allpermutation(str,i+1,n,curr.);
//        allpermutation(str,i+1,n,curr);
//
//    }
//
//}

