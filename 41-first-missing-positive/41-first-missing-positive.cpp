class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        
        int n = nums.size();
        
        for(int i=0; i<n; i++){
            nums[i] = nums[i]<=0?n+1:nums[i];
        }
        
        for(int i=0; i<n; i++){
            int y = abs(nums[i])-1;
            if(y >= 0 && y < n){
                nums[y] = nums[y]<=0?nums[y]:-nums[y];
            }
        }
        for(int i=0; i<n; i++){
           if(nums[i] >= 0) return i+1;
        }

        return n+1;
    }
};