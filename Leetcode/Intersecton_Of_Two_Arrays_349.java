// package Leetcode;
// import java.util.Scanner;
// public class Intersection_Of_Two_Arrays_349 {
//     public static void main(String [] args){
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter the size of the first array :");
//         int nums1 = input.nextInt();
//         int [] arr1 = new int[nums1];
//         System.out.println("Enter the elements of the first array :");
//         for (int i = 0; i < nums1; i++) {   
//             arr1[i] = input.nextInt();
//         }       
//         System.out.println("Enter the size of the second array :");
//         int nums2 = input.nextInt();
//         int [] arr2 = new int[nums2];
//         System.out.println("Enter the elements of the second array :");
//         for (int i = 0; i < nums2; i++) {
//             arr2[i] = input.nextInt();
//         }
//         int [] result = intersection(arr1,arr2);
//         System.out.print(result);
//     }
//     public static int[] intersection(int[] arr1, int[] arr2){
//         for(int i = 0;i<arr1.length;i++){
//             for(int j = 0;j<arr2.length;j++){
//                 if (arr1[i] == arr2[j]) {
//                     return new int[]{arr1[i]};
//                 }
//             }
//         }
//         return new int[0];
//     }
// }

package Leetcode;
import java.util.Scanner;
import java.util.Arrays;
public class Intersecton_Of_Two_Arrays_349{
    public static void main(String[] args) {
        Scanner input  new Scanner(System.in);  
        System.out.println("Enter the size of the first array :");
        int nums1 = input.nextInt();
        int [] arr1 = new int[nums1];
        System.out.println("Enter the elements of the first array :");
        for (int i = 0; i < nums1; i++) {
            arr1[i] = input.nextInt();
        }   
        System.out.println("Enter the size of the second array :");
        int nums2 = input.nextInt();
        int [] arr2 = new int[nums2];
        System.out.println("Enter the elements of the second array :");
        for (int i = 0; i < nums2; i++) {
            arr2[i] = input.nextInt();
        }
        int [] result = common(arr1,arr2);
    }
    public static int [] common(int [] arr1,int [] arr2){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<arr1.length;i++){
            for(int j = 0;i<arr2.length;j++){
                if (arr1[i] == arr2[j]) {
                    list.add(arr1[i]);
                    break;
                }
            }
        }
    }
}