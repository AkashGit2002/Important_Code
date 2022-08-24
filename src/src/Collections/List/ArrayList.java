package src.Collections.List;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;
class Arraylistmethod {
    public static void main(String[] args) {
    String str="5244";
    int output=1;
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)>='0' && str.charAt(i)<='9'){
            output*=Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        else{
            int val=(int)str.charAt(i);
            int m=Integer.MIN_VALUE;
            int t=0;
            while(val!=0){
                t=val%10;
                m=Math.max(m,t);
                val=val/10;
            }
//            price+=m;
        }
     }
        System.out.println("price="+output);
    }
}
