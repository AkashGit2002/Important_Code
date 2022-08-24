package src.ArraysQuestion;

import java.util.Collections;

public class printAllpermutations {
    public static void main(String[] args) {
        String str="Coding is very easy in a language like python";
        int max=0;
        int i=0;
        int c=0;
        while(i<str.length()){
            if(str.charAt(i)==' '){
                max=Math.max(max,c);
                c=0;
            }
            else
                c++;
            i++;
        }
        System.out.println(max);
    }
}
