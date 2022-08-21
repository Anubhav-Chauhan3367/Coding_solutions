class Solution {
    public boolean isValid(String s) {
        
        int i=0; 
        
        Stack<Character> st = new Stack<Character>();
        
        boolean ans = true;
        while(i<s.length()){
            
            char curr = s.charAt(i);
            
            if(st.isEmpty() && (curr==')' || curr=='}' || curr==']')){
                return false;
            }
            if(curr == '(' || curr == '[' || curr == '{'){
                st.push(curr);
            }
            else{
                ans = isValidUtil((char)st.peek(), curr); 
                if(ans == false) return false;
                else{
                    st.pop();
                }
            }
            
            i++;
        }
        
        return st.isEmpty()?true:false;
            
    }
    
    public boolean isValidUtil(char open, char close){

        return ((open=='(' && close==')') || (open=='[' && close==']') || (open=='{' && close=='}'));
        
    }
}