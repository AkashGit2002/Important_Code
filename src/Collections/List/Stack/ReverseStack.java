package Collections.List.Stack;

import java.lang.*;
import java.io.*;
import java.util.*;
public class ReverseStack {
    static boolean isPrime(int Number) {
        if (Number <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(Number); i++)
            if (Number % i == 0)
                return false;
        return true;
    }

    public static void main(String args[]) throws Exception {
        ArrayList<Integer> al = new ArrayList<>();
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int low = Integer.parseInt(sc.readLine());
        int high = Integer.parseInt(sc.readLine());
        int c = 0;
        for (int i = low; i <= high; i++) {
            if (isPrime(i) == true) {
                al.add(i);
                c++;
            }
        }
        System.out.println("The=" + c);
    }
}