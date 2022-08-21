class Solution {
    public boolean isValidSudoku(char[][] board) {
    
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] != '.' && !isValid(i, j, board[i][j], board)) return false;
            }
        }
        return true;    
        
    }
    
    public boolean isValid(int i, int j, char x, char[][] board){
        
        for(int k=0; k<9; k++){
            if((j != k && board[i][k] == x) || (i != k && board[k][j] == x)){
                return false;
            }
        }
               
        int s = 3;
        int rs = i - i%s;
        int cs = j - j%s;
        
        for(int a=0; a<s; a++){
            for(int b=0; b<s; b++){
                
                if(a+rs != i && b+cs != j && board[a+rs][b+cs] == x){
                    return false;
                }
            }
        }
        
        return true;
        
    }
}