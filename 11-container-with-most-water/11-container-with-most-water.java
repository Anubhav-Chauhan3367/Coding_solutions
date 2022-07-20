class Solution {
    public int maxArea(int[] height) {
        
        int max = 0;
        int n = height.length;
        int i=0; 
        int j=n-1;
        while(i<j){
            max = Math.max(max, Math.abs(i-j)*Math.min(height[i], height[j]));
            
            if(height[i] < height[j]){
                i++;
            }
            else{
                j--;
            }
           
        }
        return max;
    }
}