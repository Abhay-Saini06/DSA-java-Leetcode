
class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);

        int minEven = Integer.MAX_VALUE;
        int maxOdd = 0;

        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0) {
                minEven = Math.min(minEven, list.get(i));
            }

            if(list.get(i) % 2 != 0) {
                maxOdd = Math.max(maxOdd, list.get(i));
            }
        }

        return maxOdd - minEven;
    }
}
