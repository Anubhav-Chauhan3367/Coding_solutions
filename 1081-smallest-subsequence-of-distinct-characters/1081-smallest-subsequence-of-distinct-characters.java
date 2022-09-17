class Solution {
    
    public void pr(ArrayDeque<Character> arr){
        ArrayDeque<Character> a = new ArrayDeque<>(arr);
        while(!a.isEmpty()){
            System.out.print(a.pollLast());
        }
        System.out.println();
    }
    public String smallestSubsequence(String s) {
        
        HashMap<Character, Integer> freq = new HashMap<>();
        HashSet<Character> hs = new HashSet<Character>();
        for(Character a: s.toCharArray()){
            freq.put(a, freq.getOrDefault(a, 0)+1);
        }
        
        ArrayDeque<Character> st = new ArrayDeque<Character>();
        
        st.push(s.charAt(0));
        hs.add(s.charAt(0));
        freq.put(s.charAt(0), freq.get(s.charAt(0))-1);
        for(int i=1; i<s.length(); i++){
            char curr = s.charAt(i);
            while(!st.isEmpty() && (int)curr < (int)st.peek() && freq.get(st.peek()) >= 1 && !hs.contains(curr)){
                hs.remove(st.pop());
            }
            
            freq.put(curr, freq.get(curr)-1);
            if(!hs.contains(curr)){
                st.push(curr);
                hs.add(curr);
            }
            //pr(st);
        }
        String ans = "";
        while(!st.isEmpty()){
            ans = ans + st.pollLast();
        }
        
        return ans;
    }
    
}