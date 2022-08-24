//public class Heapsort {
//    protected static void swap(int[] arr,int i,int j){
//        int t=arr[j];
//        arr[j]=arr[i];
//        arr[i]=t;
//    }
//    protected static void hepify(int[] arr,int i,int n){
//        int largest=i;
//        int l=2*i;
//        int r=2*i+1;
//        if(l<=n && arr[l]>largest){
//            largest=l;
//        }
//        if(r<=n && arr[r]>largest){
//            largest=r;
//        }
//        while(largest!=i){
//           swap(arr,largest,i);
//            hepify(arr,largest,n);
//        }
//    }
//    protected static void bulid_heap(int arr[],int n){
//        for(int i=n/2-1;i>0;i--){
//            hepify(arr,i,n);
//        }
//    }
//    protected static void heap_sort(int[] arr,int n){
//        for(int i=n;i>1;i--){
//            System.out.println(arr[0]);
//            swap(arr,0,i);
//            hepify(arr,i-1,n);
//        }
//
//    }
//
//    public static void main(String[] args) {
//        int []arr={6,2,7,9,1,3,4};
//        bulid_heap(arr, arr.length-1);
//        heap_sort(arr, arr.length-1);
//    }
//
//}





