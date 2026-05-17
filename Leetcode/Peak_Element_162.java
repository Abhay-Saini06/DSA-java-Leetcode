package Leetcode;

import java.util.Scanner;
import java.util.Arrays;
public class Peak_Element_162 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = input.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("The array you have entered is :"+Arrays.toString(arr));
        int result = Findpeak(arr);
        System.out.print(result);
    }
    public static int Findpeak(int [] arr){
        int n = arr.length;
        if(n == 1 ) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[n-1]>arr[n-2]) return n-1;
        int st = 0;
        int end = arr.length-1;
        int ans = -1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(mid>0 && mid < n-1 && arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return mid;
            }else if(arr[mid]<arr[mid+1]){
                st = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
}