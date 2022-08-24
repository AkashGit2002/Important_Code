package src.ArraysQuestion;

public class isPrime {
    public static boolean checkPrime(int num){
        if(num==1 || num==0)
            return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        if(checkPrime(65042)){
            System.out.println("prime");
        }
        else
            System.out.println("Not prime");
    }
}
