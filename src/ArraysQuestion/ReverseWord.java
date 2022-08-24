package ArraysQuestion;

public class ReverseWord {
    private static StringBuilder reverse(StringBuilder sb){
        return sb.reverse();
    }
    public static void main(String[] args) {
        String str="coding is awesome";
        String[] arrstr=str.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String i:arrstr){
            sb.append(reverse(new StringBuilder(i)));
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
