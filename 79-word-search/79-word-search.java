class Solution {
    public boolean exist(char[][] board, String word) {
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(word.charAt(0) == board[i][j]){
                    if(wordSearch(board, word, i, j, 0)) return true;
                }
            }
        }
                
        return false;
    }
    
    public boolean wordSearch(char[][] board, String word, int i, int j, int index){
        
        if(index == word.length()) return true;
        
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j] == '#') return false;
        
        boolean res = false;
        
        if(board[i][j] == word.charAt(index)){
            
            char backTracker = board[i][j];
            board[i][j] = '#';
            res |= wordSearch(board, word, i+1, j, index+1);
            res |= wordSearch(board, word, i-1, j, index+1);
            res |= wordSearch(board, word, i, j+1, index+1);
            res |= wordSearch(board, word, i, j-1, index+1);
            board[i][j] = backTracker;
            
        }
        
        return res;
        
    }
}