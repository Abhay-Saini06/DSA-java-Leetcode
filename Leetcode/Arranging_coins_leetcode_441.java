package Leetcode;
import java.util.Scanner;

public class Arranging_coins_leetcode_441 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number :");
        int n = input.nextInt();

        int result = arrangeCoins(n);

        System.out.println("Complete rows = " + result);
    }

    public static int arrangeCoins(int n) {

        long lo = 1;
        long hi = n;

        while (lo <= hi) {

            long mid = lo + (hi - lo) / 2;

            long coins = mid * (mid + 1) / 2;

            if (coins == n) {
                return (int) mid;
            }

            else if (coins > n) {
                hi = mid - 1;
            }

            else {
                lo = mid + 1;
            }
        }

        return (int) hi;
    }
}