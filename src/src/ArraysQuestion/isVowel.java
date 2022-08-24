package src.ArraysQuestion;

import java.util.HashMap;
import java.util.Locale;

public class isVowel {
    public static void main(String[] args) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('a',1);
        map.put('e',1);
        map.put('i',1);
        map.put('o',1);
        map.put('u',1);
        String str="Code Bashers";
        str=str.toLowerCase();
        int c=0;
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                c++;
            }
        }
        System.out.println(c);
    }
}
