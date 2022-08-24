package ArraysQuestion;

public class FindOddEvenDiff {
    public static void main(String[] args) {
        int num=456;
        int tmp=0;
        int f=0;
        int even=0;
        int odd=0;
        while(num!=0){
            tmp=num%10;
            if(f==0){
                even+=tmp;
                f=1;
            }
            else {
                odd += tmp;
                f = 0;
            }
            num=num/10;
        }
        System.out.println("The Difference="+Math.abs(even-odd));

    }
}
