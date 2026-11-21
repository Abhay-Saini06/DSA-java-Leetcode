class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int pairs  = 0;
        for(int freq : map.values()){
            if(freq % 2 != 0){
                return false;
            }
            pairs += freq/2;
        }
        return pairs == nums.length/2;
    }
}
