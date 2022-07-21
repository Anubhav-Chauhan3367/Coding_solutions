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
        int k=0; 
        while(k<ans.length() && ans.charAt(k) == '0'){
            k++;
        }
        if(k == ans.length()) return "0";
        ans = ans.substring(k, ans.length());
        
        return ans;
    }
}

class MyComp implements Comparator<String>{
    
    public int compare(String a, String b){
        
        return b.concat(a).compareTo(a.concat(b))>0?1:-1;
    }
}