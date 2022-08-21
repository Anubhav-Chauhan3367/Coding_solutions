class Solution {
    public int romanToInt(String s) {
        
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        
        hm.put("I", 1);
        hm.put("IV", 4);
        hm.put("V", 5);
        hm.put("IX" , 9);
        hm.put("X", 10);
        hm.put("XL", 40);
        hm.put("L", 50);
        hm.put("XC", 90);
        hm.put("C", 100);
        hm.put("CD", 400);
        hm.put("D", 500);
        hm.put("CM", 900);
        hm.put("M", 1000);
        
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            
            if(i<s.length()-1 && hm.containsKey(s.substring(i, i+2))){
                ans += hm.get(s.substring(i, i+2));
                i += 1;
            }
            else{
                ans += hm.get(s.substring(i, i+1));
            }
            
        }
        
        return ans;
        
    }
}