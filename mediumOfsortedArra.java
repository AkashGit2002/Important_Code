// public class mediumOfsortedArra {
//     public static void main(String[] args) {
//         int ar1[] = {1, 12, 15, 26, 38};
//         int ar2[] = {2, 13, 17, 30, 45};
//         mediumfindout obj1=new mediumfindout();
//         int p=obj1.findMedium(ar1,ar2);
//         System.out.println(p);
//     }
//}
//class mediumfindout {
//    protected int findMedium(int arr1[], int arr2[]) {
//        int n = arr1.length + arr2.length;
//        int i = 0, j = 0;
//        int v1 = -1, v2 = -1;
//        for (int count = 0; count < n; count++) {
//            if (i == n - 1) {
//                v1 = v2;
//                v2 = arr2[0];
//                break;
//            }
//            if (j == n - 1) {
//                v1 = v2;
//                v2 = arr1[0];
//                break;
//            }
//            if (arr1[i] <= arr2[j]) {
//                v1 = v2;
//                v2 = arr1[i];
//                i++;
//            else{
//                    if (arr1[i] > arr2[j]) {
//                        v1 = v2;
//                        v2 = arr2[i];
//                        j++;
//                    }
//                }
//            }
//            return (v1 + v2 / 2);
//
//        }
//
//    }
//}
