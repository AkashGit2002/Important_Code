package ArraysQuestion;

public class FindMaxBinary {
    public static int FindLength(int num){
        int count=0;
        while(num!=0){
            count++;
            num=num/10;
        }
        return count;
    }
    public static int CovertDecimal(int n){
        int num = n;
        int dec_value = 0;

        // Initializing base
        // value to 1, i.e 2^0
        int base = 1;

        int temp = num;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;

            dec_value += last_digit * base;

            base = base * 2;
        }

        return dec_value;
    }
    public static void main(String[] args) {
        int t=3;
        String s1="101 100";
        String s2="110 10";
        String s3="1000 11";
        String[] sa1=s1.split(" ");
        String[] sa2=s2.split(" ");
        String[] sa3=s3.split(" ");



        int t1=CovertDecimal(Integer.parseInt(sa1[0]))+CovertDecimal(Integer.parseInt(sa1[1]));
        int t2=CovertDecimal(Integer.parseInt(sa2[0]))+CovertDecimal(Integer.parseInt(sa2[1]));
        int t3=CovertDecimal(Integer.parseInt(sa3[0]))+CovertDecimal(Integer.parseInt(sa3[1]));
        System.out.println(t1+" "+t2+" "+t3);

    }
}
