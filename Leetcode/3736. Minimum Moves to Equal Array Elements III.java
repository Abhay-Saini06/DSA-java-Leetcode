class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0];
        for(int i = 0;i<nums.length;i++){
            if(max<nums[i]){
                max = nums[i];
            }
        }
        int ans = 0;
        for(int i = 0;i<nums.length;i++){
            int diff = max-nums[i];
            ans = ans + diff;
        }
        return ans;
    }
}
