package ArraysQuestion;

// brute-force
public class MaxSubArr {
    static void Kadanes(int[] arr, int size) {
        int curr = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            curr += arr[i];
            if (curr < 0)
                curr = 0;
            max = Math.max(max, curr);
        }
        System.out.println("Max" + max);
    }

    static void brute(int[] arr, int size) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                sum = 0;
                for (int k = i; k <= j; k++)
                    sum += arr[k];
                max = Math.max(max, sum);
            }
        }
        System.out.println("The max-Value" + max);
    }

    public static void main(String[] args) {

        int[] arr = {-1, 4, 7, 2,-1,-3,-6,6,5,12,78,-67};
        int size = arr.length;
        brute(arr, size);
        Kadanes(arr, size);
    }
}

// Kadan's algo

