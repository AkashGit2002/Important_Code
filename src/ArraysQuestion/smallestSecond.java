package ArraysQuestion;

import java.util.PriorityQueue;
public class smallestSecond {
    private static int Nthlargest(PriorityQueue<Integer> pq,int k){
        while(k!=0){
            pq.poll();
            k--;
        }
        return pq.peek();
    }
    private static int NthSmallest(PriorityQueue<Integer> pq,int k){
        while(k>0){
            pq.poll();
            k--;
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int[] arr={7,2,4,1,8,9};
        int k=2;
        int n= arr.length;
        for(int i=0;i< arr.length;i++){
            pq.add(arr[i]);
        }
//        System.out.println("The largest="+Nthlargest(pq,n-k));
        System.out.println("The largest="+NthSmallest(pq,1));
//        System.out.println(pq.peek());
    }
}
