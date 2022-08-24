package src.Collections.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.Arrays;
import java.util.HashMap;

public class Employee {
    public static void main(String[] args) {
        int[] arr1={9,1,10,1,2,5,99,3};
        int[] arr2={2,1,9,5};
        HashMap map1=new HashMap<>();
        HashMap map2=new HashMap<>();
        int i=0;
        int j=0;
        while(i<arr1.length || j<arr2.length){
            if(i< arr1.length){
                if(map1.containsKey(arr1[i]))
                    map1.put(arr1[i], map1.get(arr1[i]+1));
                else
                    map1.put(arr1[i],1);
                i++;
            }
            if(j<arr2.length){
                if(map2.containsKey(arr2[j]))
                    map2.put(arr2[i], map2.get(arr1[i]+1));
                else
                    map2.put(arr2[i],1);
                j++;
            }
            Arrays.sort(arr1);
            for(int it=0;it< arr2.length;it++){
                int ij=0;
                if(map1.containsKey(arr2[it])){
                    int freq= (int) map1.get(arr2[it]);
                    while(freq!=0){
                        arr1[ij++]=arr2[it];
                        freq--;
                    }
                    map1.remove(arr2[it]);
                }
            }
           for( i=0;i< arr1.length;i++)
               System.out.println(arr1[i]);
        }
    }

}