package MindTree;

public class CheckOdd {
    private static void printOdd(int n){
        if(n==0)
            return;
        printOdd(n-2);
        System.out.println(n);
    }
    private static  void printEven(int n){
        if(n==0)
            return;
        printEven(n-2);
        System.out.println(n);
    }
    public void main(String[] args) {
        int n=10;
        if((n&1)==1){
            printOdd(n);
        }
        else{
            printEven(n);
        }
    }
}
