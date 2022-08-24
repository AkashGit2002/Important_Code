package ArraysQuestion;

import java.util.HashMap;

public class ZeroSubArr {
    private static int zeroSum(int[] arr,int size){
        HashMap<Integer,Integer> map=new HashMap<>();
        int length=0;
        map.put(arr[0],0);
        int prefix=arr[0];
        for(int i=1;i<size;i++){
            prefix+=arr[i];
            if(prefix==0)
                length=(i-0)+1;
            if(map.containsKey(prefix)){
                length=Math.max(length,Math.abs(i-map.get(prefix)));
            }
            else
                map.put(prefix,i);
        }
        return length;
    }
    public static void main(String[] args) {
        int[] arr = {1,-1,3,2,-2,-8,1,7,10,23};
        System.out.println(("The bruteForce solution is"+zeroSum(arr,arr.length)));
    }
}
