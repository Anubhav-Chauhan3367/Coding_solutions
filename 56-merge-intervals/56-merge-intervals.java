class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        List<int[]> ans = new ArrayList<>();
        ans.add(intervals[0]);
        
        for(int i=1; i<intervals.length; i++){
            
            if(intervals[i][0] <= ans.get(ans.size()-1)[1]){
                int[] curr = {ans.get(ans.size()-1)[0], Math.max(intervals[i][1], ans.get(ans.size()-1)[1])};
                ans.set(ans.size()-1, curr);
            }
            else{
                ans.add(intervals[i]);
            }
            
        }
        
        return ans.toArray(new int[ans.size()][]);
        
              
    }
}