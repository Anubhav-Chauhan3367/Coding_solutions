class Solution {
    public int myAtoi(String s) {

        s = s.trim();
        if(s.length() == 0) return 0;
       
        long res = 0;
        int i=0;
        boolean negative = false;
        
        if(s.charAt(i) == '-' || s.charAt(i) == '+'){
            negative = s.charAt(i)=='-'? true: false;
            i++;
        }
        
        if(i == s.length() || !Character.isDigit(s.charAt(i))) return 0;
        
        while(i < s.length() && Character.isDigit(s.charAt(i))){
            res = res*10 + s.charAt(i)-'0';
            i++;
            
            if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE){
                return negative?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            
        }

        return negative?-(int)res: (int)res;
        
    }
}