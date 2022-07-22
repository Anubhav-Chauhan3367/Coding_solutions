class Solution {
    public String removeDuplicateLetters(String s) {
        
        boolean charA[] = new boolean[26];
        int li[] = new int[26];
        char a[] = s.toCharArray();
        for(int i=0; i<a.length; i++){
            li[a[i]-'a'] = i;
        }
        Stack<Character> arr = new Stack<Character>();
        arr.push(s.charAt(0));        
        charA[s.charAt(0)-'a'] = true;
        for(int i=1; i<s.length(); i++){
           
            if(charA[a[i]-'a'] == true) continue;
            while(!arr.isEmpty()&&  a[i]<(char)arr.peek() && li[(char)arr.peek()-'a']>i){
                charA[arr.pop()-'a'] = false;
            }
            
            arr.push(s.charAt(i));
            charA[a[i]-'a'] = true;
            
        }
        String ans = "";
        for(Character x: arr){
            ans += x;
        }
        
        return ans;
        
    }
}