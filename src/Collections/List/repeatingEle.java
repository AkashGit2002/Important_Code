package src.Collections.List;
import java.util.*;
import java.util.Map.*;
public class repeatingEle {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        int arr[]={1,2,-1,1,3,1};
        for(int i=0;i<arr.length;i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }
}
