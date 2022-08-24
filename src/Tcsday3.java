package src;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;
public class Tcsday3 {
    public static void main(String[] args)throws Exception {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        String str=sc.readLine();
        String str1=sc.readLine();
        int carry=0;
        for(int i=0;i<str.length();i+=str1.length()){
            carry= (int) (Math.pow(10,str1.length())*carry+Integer.parseInt(str.substring(i,str1.length())));
            carry%=(Integer.parseInt(str1));
        }
        System.out.println(carry);
    }

}
