package src;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class createPhone{
    public String encrypt(String str[],String s,int n){
        String out="";
        for(int i=0;i<n;i++){
            if(s.charAt(i)== ' '){
                out=out+"0";
            }
            else{
                int n1=s.charAt(i)-'A';
                out=out+str[n1];
            }
        }
        return(out);
    }

}
public class equiPhone {
    public static void main(String[] args)throws Exception {
        String str[] = {"2","22","222",
                "3","33","333",
                "4","44","444",
                "5","55","555",
                "6","66","666",
                "7","77","777","7777",
                "8","88","888",
                "9","99","999","9999"
        };
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        String s=input.readLine();
        if(s.length()==0)
            System.out.println("Enter Any String");
        else{
            createPhone obj1=new createPhone();
            System.out.println(obj1.encrypt(str,s.toUpperCase(),s.length()));
        }

    }
}
