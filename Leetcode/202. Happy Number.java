class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> map = new HashSet<>();
        int dig = n;
        while(n != 1 && !map.contains(n)){
            map.add(n);
            int sum = 0;
            while(n!=0){
                dig = n%10;
                sum += dig*dig;
                n = n/10;
            }
            n = sum;
        }
        return n == 1;
    }
}
