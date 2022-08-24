package src.ArraysQuestion;

import java.util.HashMap;

public class Code {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        String str="p is is best web";
        String[] arr=str.split(" ");
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],1);
            max=Math.max(max,map.get(arr[i]));
        }
        for(Integer k:map.values()){
            System.out.println(k);
        }
        System.out.println(max);
        System.out.println(map.get("is"));


//        String str=" p is  best web";
//        String[] starr=str.split(" ");
//        int count=0;
//        for(int i=0;i<starr.length;i++){
//            if(starr[i]==" "){
//                count++;
//            }
//        }
//
//        System.out.println(count);
//    }
    }
}
