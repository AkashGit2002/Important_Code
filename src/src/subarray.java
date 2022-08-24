package src;
import java.util.Arrays;
import java.util.*;
import java.io.*;
//import java.sql.SQLOutput;
//
////import java.io.*;
////public class subarray {
////    public static void main(String[] args)throws Exception {
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        String str[] = br.readLine().split(““);
////    }
////}
////import java
//class Abc {
//    public static boolean isSix(int num){
//        while(num>0){
//            int p=num%10;
//            if(p==6)
//                return true;
//            num=num/10;
//        }
//        return false;
//    }
//    public static int reverse(int num){
//        int p=0;
//        int t=0;
//        int s=0;
//        while(num>0)
//        {
//            t=num%10;
//            if(t==6)
//                t=t+3;
//            s=s*10+t;
//            num=num/10;
//        }
//        return s;
//    }
//    public static void main(String[] args)throws Exception {
//        String str="43,66,225,76";
//        String arr[] =str.split(",");
//        int val=0;
//        int sum=0;
//        for(String itr:arr)
//        {
////            int p=Integer.parseInt(itr);
//            int p=Integer.parseInt(itr);
//            if(isSix(p)==true){
//                val=reverse(p);
//                sum=sum+val;
//            }
//            else{
//                sum=sum+p;
//            }
//        }
//        System.out.println("The Avg is:"+sum/arr.length);
//    }
//}




public class subarray {
    private static int size;

    private static int k;
    static void swap(int[] arr,int s,int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
    static void rotation(int[] arr,int start,int end){
        int i=start;
        int j=end;
        while(i<=j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public static void main(String[] args)throws Exception {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array:=");
         size=Integer.parseInt(input.readLine());
        System.out.println("Enter the position of the array:=");
         k=Integer.parseInt(input.readLine());
        System.out.println("Enter the  array Elements one after another:=");
        int[] arr=new int[size];
        for(int i = 0; i<size; i++){
            arr[i]=Integer.parseInt(input.readLine());
        }
        rotation(arr,0,k);
        rotation(arr,size-k,size-1);
        rotation(arr,0,size-1);
        System.out.println("The Final Array is:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
