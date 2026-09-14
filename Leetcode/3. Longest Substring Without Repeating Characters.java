class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap <Character,Integer> map1 = new HashMap<>();
        int max = 0;
        int left = 0;
        for(int right = 0;right<s.length();right++){
            while(map1.containsKey(s.charAt(right))){
                map1.remove(s.charAt(left));
                left++;
            }
            map1.put(s.charAt(right),1);
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}
