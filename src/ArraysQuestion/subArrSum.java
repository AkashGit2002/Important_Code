package ArraysQuestion;

import java.util.HashMap;

public class subArrSum {
    static int Optimal(int[] arr,int n,int k){
        int prefixSum=0;
        int count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(prefixSum==k)
                count++;
            prefixSum+=arr[i];
            if(map.containsKey(prefixSum-k)){
                count+=map.get(prefixSum-k);
            }
            if(i==0)
                map.put(arr[i],1);
            else
                map.put(prefixSum,1);
        }
        return count;
    }
    static int bruteForce(int[] arr,int n,int k){
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++) {
                sum += arr[j];
                if(sum==k)
                    count++;
            }
            sum=0;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,7,2,-3,1,4,2};
        System.out.println("The bruteForce solution is"+Optimal(arr,arr.length,7));

    }
}
