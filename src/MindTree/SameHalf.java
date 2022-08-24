package MindTree;

public class SameHalf {
    public static void main(String[] args) {
        int val=239017;
        String str=String.valueOf(val);
        int len=str.length();
        int fsum=0;
        int ssum=0;
        int half=(len/2);
        for(int i=0;i<len;i++){
            int v=Integer.parseInt(Character.toString(str.charAt(i)));
            if(i<half){
                fsum+=v;
            }
            else{
                ssum+=v;
            }
        }
        if(fsum==ssum)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
