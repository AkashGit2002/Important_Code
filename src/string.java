package src;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Collections;
public class string {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str= input.readLine();
        char[] ch=str.toCharArray();
        for(int i=0;i< ch.length;i++){
            char temp = ch[i];
            ch[i] = ch[i + 1];
            ch[i + 1] = temp;
        }
        String str1=ch.toString();
        System.out.println(str1);
        input.close();
    }
}
