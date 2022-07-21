class Solution {
    public String largestNumber(int[] nums) {
        
        String arr[] = new String[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr, new MyComp());
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<nums.length; i++){
            ans.append(arr[i]);
        }
        
        if(ans.toString().charAt(0) == '0') return "0";
        
        return ans.toString();
    }
}

class MyComp implements Comparator<String>{
    
    public int compare(String a, String b){
        
        return b.concat(a).compareTo(a.concat(b))>0?1:-1;
    }
}