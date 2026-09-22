class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int maxfreq = 0;
        for (int freq : map.values()) {
            maxfreq = Math.max(maxfreq, freq);
        }
        int ans = nums.length;
        for (int num : map.keySet()) {
            if (map.get(num) == maxfreq) {
                int first = -1;
                int last = -1;
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == num) {
                        first = i;
                        break;
                    }
                }
                for (int i = nums.length - 1; i >= 0; i--) {
                    if (nums[i] == num) {
                        last = i;
                        break;
                    }
                }
                int length = last - first + 1;
                ans = Math.min(ans, length);
            }
        }
        return ans;
    }
}
