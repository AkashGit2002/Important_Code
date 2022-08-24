package src.ArraysQuestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MatrixSum {
    public static void main(String[] args) throws Exception {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the values");
        int[][] arr=new int[3][3];
        ArrayList<Integer> alist=new ArrayList<>();
        int row=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=Integer.parseInt(sc.readLine());
                row+=arr[i][j];
            }
            alist.add(row);
            row=0;
        }
        int max=0;
        for(Integer itr:alist){
            System.out.println(itr);
             max=Math.max(max, itr);
        }
        System.out.println(max);

    }
}
