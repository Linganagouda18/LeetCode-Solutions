class Solution {
    public boolean exist(char[][] board, String word) {
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if( (board[i][j] == word.charAt(0)) && combination(board,word,i,j,0) )
                    return true;
            }
        }


        return false;
    }

    public static boolean combination(char[][] board,String word,int i,int j,int count){

        if(count==word.length())
            return true;

        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!=word.charAt(count))
            return false;

        char temp = board[i][j];
        board[i][j] = '.';
    
        boolean found = combination(board,word,i+1,j,count+1) ||
                        combination(board,word,i-1,j,count+1) ||
                        combination(board,word,i,j+1,count+1) ||
                        combination(board,word,i,j-1,count+1);

        board[i][j] = temp;

        return found;
    }
}