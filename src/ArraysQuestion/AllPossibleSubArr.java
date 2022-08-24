package ArraysQuestion;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AllPossibleSubArr {

    private static void PrintSubArr(int[] arr,int size){

        for(int i=0;i<size;i++){
           for(int j=i;j<size;j++){
               for(int k=i;k<=j;k++)
                   System.out.print(arr[k]+" ");
               System.out.println();
           }

        }
    }
    public static void main(String[] args) {
//        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int[]arr={-1,4,7,2};
        PrintSubArr(arr,arr.length);

    }

}
