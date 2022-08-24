package ArraysQuestion;

public class Space {
    public static void main(String[] args) {

        String str="12567 899 907 56";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=32){
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
