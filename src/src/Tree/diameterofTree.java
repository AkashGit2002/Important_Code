package src.Tree;

import java.util.ArrayList;

public class diameterofTree {
    public static void main(String[] args) {
        ArrayList<Integer> alist=new ArrayList<>();
        int a=10;
        int f=0;
        if(a<10){
            System.out.println("The value"+(a+10));
        }
        else{
            for(int i=9;i>1;i--){
                while(a%i==0){
                    a=a/i;
                    alist.add(i);
                }
            }
            if(a>10){
                System.out.println("Not Possible");
                f=1;
            }
        }
        if(f!=1){
            for(int i=alist.size()-1;i>=0;i--){
                System.out.print(alist.get(i));
            }
        }

    }


}
