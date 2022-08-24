class Solution {
    public List<String> restoreIpAddresses(String s) {
        
        
        List<String> ans = new ArrayList<String>();
        
        if(s.length() > 12){
            return ans;    
        }
        
        helper(s, ans, 0, "", 0);
        
        return ans;
        
    }
    
    public void helper(String s, List<String> ans, int indx, String curr, int dots){
        
        if(dots == 4 && indx == s.length()){
            ans.add(curr.substring(0, curr.length()-1));
            return;
        }
        if(dots > 4 || (dots<4 && indx == s.length())){
            return;
        }
        
        for(int i=indx; i<indx+3 && i<s.length(); i++){
            
            if(Integer.valueOf(s.substring(indx, i+1)) < 256 && (indx == i || s.charAt(indx) != '0')){
                helper(s, ans, i+1, curr+s.substring(indx, i+1)+".", dots+1);   
            }
        }
        
    }
    
}