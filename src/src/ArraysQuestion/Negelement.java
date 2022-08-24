package src.ArraysQuestion;

public class Negelement {
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int n = arr.length;
        int i=0;
        int j=n-1;
        while(i<=j){
            if(arr[i]<0)
                i++;
            if(arr[j]>0){
                j--;
            }
            if(arr[i]>0 && arr[j]<0){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        for(int k:arr){
            System.out.print(k+" ");
        }
    }
}
