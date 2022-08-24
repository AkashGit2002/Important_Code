package src.ArraysQuestion;

import java.util.*;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr={1,3,5,6,3,2,3,5,5,4,3,2};
        Arrays.sort(arr);
        Set<Integer> set=new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(Integer itr:set){
            System.out.print(itr+" ");
        }
    }
}
