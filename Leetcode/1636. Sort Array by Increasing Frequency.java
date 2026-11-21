class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int [][] arr = new int[map.size()][2];
        int i = 0;
        for(int key :map.keySet()){
            arr[i][0] = key;
            arr[i][1] = map.get(key);
            i++;
        }
       Arrays.sort(arr, (a, b) -> {
        if(a[1] == b[1]){
            return b[0] - a[0];
            }
            return a[1] - b[1];
        });
        int index = 0;
        for(int k = 0; k < arr.length; k++){
            for(int j = 0; j < arr[k][1]; j++){
                nums[index++] = arr[k][0];
            }
        }
        return nums;
    }
}
