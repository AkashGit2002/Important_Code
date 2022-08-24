package ArraysQuestion;

public class Emptypackets {
    public static void main(String[] args) {
        int[] arr={4,5,0,1,9,0,5,0};
        int[] temp=new int[arr.length];
        int count=0;
        int f=0;
        int j=0;
        int size=arr.length;
        for(int i=0;i< size;i++){
          if(arr[i]==0)
              count++;
          else
              temp[j++]=arr[i];
        }
        while(j< arr.length)
            temp[j++]=0;
        for(int i:temp){
            System.out.print(i+" ");
        }

    }
}
