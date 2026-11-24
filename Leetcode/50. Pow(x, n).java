
class Solution {
    public double myPow(double x, int n) {

        long power = n;
        boolean negative = power < 0;

        if (negative) {
            power = -power;
        }

        double ans = power(x, power);

        if (negative) {
            ans = 1.0 / ans;
        }

        return ans;
    }

    public double power(double x, long n) {

        if (n == 0) return 1.0;

        double call = power(x, n / 2);

        if (n % 2 == 0) {
            return call * call;
        } else {
            return x * call * call;
        }
    }
}
