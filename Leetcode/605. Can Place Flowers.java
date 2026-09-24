class Solution {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 1) {
            if (n == 0) {
                return true;
            }
            return flowerbed[0] == 0;
        }

        int st = 1;
        int end = flowerbed.length - 1;
        int count = 0;
        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            count++;
        }
        for (int i = st; i < end; i++) {

            if (flowerbed[i] == 0 &&
                flowerbed[i - 1] == 0 &&
                flowerbed[i + 1] == 0) {

                flowerbed[i] = 1;
                count++;
            }
        }
        if (flowerbed[end] == 0 && flowerbed[end - 1] == 0) {
            flowerbed[end] = 1;
            count++;
        }

        return count >= n;
    }
}
