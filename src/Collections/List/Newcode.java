package Collections.List;
import java.util.HashMap;
public class Newcode {

    public static void main(String[] args) {
        String strArr[]={"abcgefd", "a,ab,abc,abcg,b,c,dog,e,efd,zzzz"};
        String str=strArr[0];
        String sub1="";
        String sub2="";
        int i=0;
        int j=1;
        int len=str.length();
        String[] subArr=strArr[1].split(",");
        HashMap<String,Integer> map=new HashMap<>();
        for(int p=0;p<subArr.length;p++)
            map.put(subArr[p],1);
       while(i<len && j<len){
            sub1=str.substring(0,i+1);
            sub2=str.substring(j,len);
            if(map.containsKey(sub1) && map.containsKey(sub2))
                break;
            i++;
            j++;
        }
       String res=sub1+","+sub2;
        System.out.println("Final result="+res);

    }
}
