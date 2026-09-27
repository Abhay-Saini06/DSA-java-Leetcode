class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int gastotal = 0;
        int costtotal = 0;

        for (int i = 0; i < gas.length; i++) {
            gastotal += gas[i];
            costtotal += cost[i];
        }

        if (costtotal > gastotal) return -1;

        int surplus = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {

            int check = gas[i] - cost[i];

            surplus += check;

            if (surplus < 0) {
                start = i + 1;
                surplus = 0;
            }
        }

        return start;
    }
}
