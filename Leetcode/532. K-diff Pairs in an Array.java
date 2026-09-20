class Solution {
    public int findPairs(int[] nums, int k) {
        if(k == 0){
            HashSet<Integer> set = new HashSet<>();
            HashSet<Integer> repeated = new HashSet<>();
            for(int i : nums){
                if(set.contains(i)){
                    repeated.add(i);
                }else{
                    set.add(i);
                }
            }
            return repeated.size();
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int count = 0;
        for(int i : set){
            if(set.contains(i+k)) count++;
        }
        return count;
    }
}
