package ArraysQuestion;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DpFactorial {
    public static void main(String[] args) {
        String str="CodeBashers";
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        for(int i=0;i<str.length();i++)
            set.add(str.charAt(i));
        for(char ch:set)
            System.out.print(ch);
    }

}