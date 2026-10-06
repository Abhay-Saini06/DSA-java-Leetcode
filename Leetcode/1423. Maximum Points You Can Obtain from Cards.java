class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int n = cardPoints.length;

        int i = 0;
        int j = n - k;

        int sum = 0;
        for(int x = j; x < n; x++) {
            sum += cardPoints[x];
        }

        int max = sum;

        while(i < k) {

            sum = sum - cardPoints[j] + cardPoints[i];

            max = Math.max(max, sum);

            i++;
            j++;
        }

        return max;
    }
}
