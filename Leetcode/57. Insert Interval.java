class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> arr = new ArrayList<>();
        for(int[] interval : intervals){
            arr.add(interval);
        }
        arr.add(newInterval);
        arr.sort((a,b) -> a[0]-b[0]);
        for(int i =1;i<arr.size();i++){
            if(arr.get(i)[0]<=arr.get(i-1)[1]){
                int [] merged = new int[2];

                merged[0] = Math.min(arr.get(i)[0],arr.get(i-1)[0]);
                merged[1] = Math.max(arr.get(i)[1],arr.get(i-1)[1]);
                arr.set(i-1,merged);
                arr.remove(i);
                i--;
            }
        }
        int [][] result = new int[arr.size()][2];
        for(int i = 0;i<arr.size();i++){
            result[i] = arr.get(i);
        }
        return result;
    }
}
