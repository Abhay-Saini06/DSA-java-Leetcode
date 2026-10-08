class Solution {
    public boolean carPooling(int[][] trips, int capacity) {

        int min = trips[0][1];
        int max = trips[0][2];

        for (int i = 1; i < trips.length; i++) {
            min = Math.min(min, trips[i][1]);
            max = Math.max(max, trips[i][2]);
        }

        int current = 0;

        for (int location = min; location <= max; location++) {

            for (int i = 0; i < trips.length; i++) {
                if (location == trips[i][2]) {
                    current -= trips[i][0];
                }
                if (location == trips[i][1]) {
                    current += trips[i][0];
                }
            }

            if (current > capacity) {
                return false;
            }
        }

        return true;
    }
}
