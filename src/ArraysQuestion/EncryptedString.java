package ArraysQuestion;
public class EncryptedString{
    public static void main(String[] args) {
        String str="as3gAsd";
        StringBuilder EncryStr=new StringBuilder();
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            ch=(char)((int)ch+3);
            EncryStr.append(ch);
        }
        System.out.println("Value="+EncryStr);
    }
}