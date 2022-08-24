package src;

public class ArrayInsertion {
    protected void insert_at_beginning(int[] arr,int key){
        int t=arr[arr.length-2];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=key;
        arr[arr.length-1]=t;
    }
    protected void insert_at_end(int [] arr,int key){

    }
    protected void insert_at_any_position(int [] arr,int pos,int key){

    }
    protected void print(int[] arr){
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,0};
        ArrayInsertion obj=new ArrayInsertion();
        obj.insert_at_beginning(arr,78);
        obj.print(arr);
//        obj.insert_at_end(arr,100);
//        obj.insert_at_any_position(arr,5,199);
    }
}
