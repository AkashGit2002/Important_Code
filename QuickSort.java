// Java implementation of QuickSort
import java.io.*;

public class QuickSort {
    public static void swap(int[] a,int i, int j){
        int temp=a[i];
        a[j]=a[i];
        a[j]=temp;
    }
    public static int Select_pivot(int[] arr,int l,int h,int n){

        int pivot=arr[l];
        int i=l;
        int j=h;
        while(i<j){
            while(pivot>=arr[l]){
                i++;
            }
            while(pivot<arr[h]){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        swap(arr,l,j+1);
        return j+1;
    }
    public static void quicksort(int[] arr,int i, int j,int n){
        if(i<j){
            int pindex=Select_pivot(arr,i,j,n);
            quicksort(arr,i,pindex-1,n);
            quicksort(arr,pindex+1,j,n);
        }

    }
    public static void main(String[] args) {
        int[] arr={5,1,9,4,2,6,10};
        quicksort(arr,0, arr.length-1,arr.length);
        for(int i:arr){
            System.out.println(i);
        }
    }
}