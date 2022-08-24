package src.ArraysQuestion;

public class tcsNqt {
    private static int Findsum(int Num){
        int sum=0;
        while(Num!=0){
            sum+=(Num%10);
            Num=Num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int number=6442;
        int sum= Findsum(number);
        if(!(sum>=1 && sum<=26)){
            sum=Findsum(sum);
        }
        sum--;
        char ch='A';
        System.out.println("The Question Set is="+((char)(ch+sum)));

    }
}
