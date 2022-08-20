class Solution {
    public String longestPalindrome(String s) {
        
                
        String ans = "";
        char[] arr = s.toCharArray();
        int max=0;
        
        for(int i=0; i<arr.length; i++){
            int l=i,r=i;
            while(l>=0 && r<arr.length && s.charAt(l) == s.charAt(r)){
                if((r-l+1) > max){
                    ans = s.substring(l, r+1);
                    max = r-l+1;
                }
                l--;
                r++;
            }
            
            l=i;
            r=i+1;
            while(l>=0 && r<arr.length && arr[l] == arr[r]){
                if((r-l+1) > max){
                    ans = s.substring(l, r+1);
                    max = r-l+1;
                }
                l--;
                r++;
            }
        }

        return ans;
    }
}