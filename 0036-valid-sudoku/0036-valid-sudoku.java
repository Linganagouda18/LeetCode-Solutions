class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String>set = new HashSet<>();

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char num = board[i][j];

                if(num == '.') continue;

                String newRow = "row" + i +"-"+num;
                String newCol = "col" + j +"-"+num;
                String newBox = "box" + (i/3) +"-"+(j / 3) + "-" + num;

                if(set.contains(newRow) || set.contains(newCol) || set.contains(newBox)) return false;

                set.add(newRow);
                set.add(newCol);
                set.add(newBox);
            }
        }
        return true;
    }
}