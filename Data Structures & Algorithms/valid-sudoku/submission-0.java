class Solution {
    Set<Integer> commonSet = new HashSet<>();
    public boolean checkRow(char[][] board, int i){
        for(int j=0;j<9;j++){
            if(board[i][j] == '.') continue;
            if(commonSet.contains(board[i][j]-'0')) return false;
            commonSet.add(board[i][j]-'0');
        }
        commonSet.clear();
        return true;
    }
    public boolean checkCol(char[][] board, int j){
        for(int i=0;i<9;i++){
            if(board[i][j] == '.') continue;
            if(commonSet.contains(board[i][j]-'0')) return false;
            commonSet.add(board[i][j]-'0');
        }
        commonSet.clear();
        return true;
    }
    public boolean checkBox(char[][] board, int i, int j){
        for(int x=i; x<i+3;x++){
            for(int y=j;y<j+3;y++){
                if(board[x][y] == '.') continue;
                if(commonSet.contains(board[x][y]-'0')) return false;
                commonSet.add(board[x][y]-'0');
            }
        }
        commonSet.clear();
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            if(!checkRow(board,i)) return false;
            if(!checkCol(board,i)) return false;
        }
        for(int i=0; i<9; i+=3){
            for(int j=0;j<9;j+=3){
                if(!checkBox(board,i,j)) return false;
            }
        }
        return true;
    }
}
