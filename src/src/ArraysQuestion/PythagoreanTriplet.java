package src.ArraysQuestion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PythagoreanTriplet {
    public static void main(String[] args)throws Exception {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the test-cases:");
        int t=Integer.parseInt(sc.readLine());
        ArrayList<Integer> alist=new ArrayList<>();
        while((t--)!=0){
            System.out.println("Enter value");
            alist.add(Integer.parseInt(sc.readLine()));
        }
        for(int i=0;i<alist.size();i+=2){
            double v = Math.pow(alist.get(i), 2) + Math.pow(alist.get(i+1), 2);
            v=Math.sqrt(v);
            System.out.print(alist.get(i)+" "+alist.get(i+1)+" "+v);
        }
    }
}
