class Solution {
    public String largestNumber(int[] nums) {
        
        String arr[] = new String[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i] = ""+nums[i];
        }
        Arrays.sort(arr, new MyComp());
        String ans = "";
        for(int i=0; i<nums.length; i++){
            ans += arr[i];
        }
        if(ans.charAt(0) == '0') return "0";
        
        return ans;
    }
}

class MyComp implements Comparator<String>{
    
    public int compare(String a, String b){
        
        return b.concat(a).compareTo(a.concat(b))>0?1:-1;
    }
}