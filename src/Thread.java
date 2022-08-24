////// { Driver Code Starts
////// Initial Template for Java
////package src;
////
////   import java.util.*;
////import java.lang.*;
////import java.io.*;
////
////    /* Name of the class has to be "Main" only if the class is public. */
////    class Codechef
////    {
////        public static boolean isPlindrome(int num) {
////            int t = num;
////            int temp = 0;
////            int sum = 0;
////            while (num != 0) {
////                t = num % 10;
////                sum = sum * 10 + t;
////                num = num / 10;
////            }
////            if (t == sum)
////                return true;
////            else
////                return false;
////        }
////        public static void main (String[] args) throws java.lang.Exception
////        {
////            Scanner input=new Scanner(System.in);
////            int t=input.nextInt();
////            int i=0;
////
////            while(i<t){
////                int n=input.nextInt();
////                int k=input.nextInt();
////                int itr1=0;
////                int itr2=
////                if(k==0)
////                    System.out.println("NO");
////
////                i++;
////            }
////
////        }
////    }
//
//
//ArrayList<Integer> soln = new ArrayList<Integer>();
//
//        //Check for bad input
//        if (s.length() == 0 || p.length() == 0 || s.length() < p.length()){
//        return new ArrayList<Integer>();
//        }
//
//
//        int[] chars = new int[26];
//        for (Character c : p.toCharArray()){
//
//        chars[c-'a']++;
//        }
//
//
//        int start = 0, end = 0, len = p.length(), diff = len;
//
//        char temp;
//
//        for (end = 0; end < len; end++){
//
//        temp = s.charAt(end);
//
//
//        chars[temp-'a']--;
//
//
//        if (chars[temp-'a'] >= 0){
//        diff--;
//        }
//        }
//
//
//        if (diff == 0){
//        soln.add(0);
//        }
//
//        while (end < s.length()){
//
//        temp = s.charAt(start);
//
//
//        if (chars[temp-'a'] >= 0){
//        diff++;
//        }
//
//
//        chars[temp-'a']++;
//
//
//        start++;
//
//
//        temp = s.charAt(end);
//
//
//        chars[temp-'a']--;
//
//
//        if (chars[temp-'a'] >= 0){
//        diff--;
//        }
//
//
//
//
//        if (diff == 0){
//        soln.add(start);
//        }
//
//
//        end++;
//
//        }
//
//        return soln;
//
//
