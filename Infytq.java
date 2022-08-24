import java.util.Arrays;
import java.util.*;
import java.io.*;
public class Infytq {

    static void swap(int[] arr,int s,int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
    static void rotation(int[] arr,int start,int end){
        int i=start;
        int j=end;
        while(i!=j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public static void main(String[] args)throws Exception {
       BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array:=");
        int size=Integer.parseInt(input.readLine());
        ystem.out.println("Enter the position of the array:=");
        int pos=Integer.parseInt(input.readLine());
        System.out.println("Enter the  array Elements one after another:=");
        for(int i=0;i<size;i++){
            arr[i]=Integer.parseInt(input.readLine());
        }
        rotation(arr,0,size-k-1);
        rotation(arr,size-k,size-1);
        rotation(arr,0,size-1);
        System.out.println("The Final Array is:");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
