class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        for(int x : nums){
            set.add(x);
        }
        ArrayList <Integer> ans = new ArrayList<>();
        int low = nums[0];
        int high = nums[0];
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<low){
                low = nums[i];
            }
            if(nums[i]>high){
                high = nums[i];
            }
        }
        for(int i = low;i<=high;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}
