package ArraysQuestion;

public class CircularSubArrSum {
    static int Kadanes(int[] arr, int size) {
        int curr = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            curr += arr[i];
            if (curr < 0)
                curr = 0;
            max = Math.max(max, curr);
        }
        return max;
    }
    static int circularSubarrSum(int[] arr,int size){
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=arr[i];
            arr[i]=-arr[i];
        }
        return sum+Kadanes(arr,size);

    }
    public static void main(String[] args) {

        int[] arr = {4,-4,6,-6,10,-11,12};
        int size = arr.length;
        System.out.println("The Result is="+circularSubarrSum(arr,size));

    }
}
