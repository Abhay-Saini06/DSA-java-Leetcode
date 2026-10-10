
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = 0;

        for (int i = 0; i < timeSeries.length - 1; i++) {
            int diff = timeSeries[i + 1] - timeSeries[i];

            if (diff >= duration) {
                total += duration;
            } else {
                total += diff;
            }
        }

        total += duration;

        return total;
    }
}
