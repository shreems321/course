public class Sudoku {
    public boolean isValidSudoku(char[][] board){
        Set<Character>[] rowSet = new Hashset[9];
        Set<Character>[] colSet = new Hashset[9];
        Set<Character>[] gridSet = new Hashset[9];

        for (int i = 0;i<9;i++){
            for (int j=0;j<9;j++){
                int gridNo  = (i/3)*3+(j/3);

                if(board[i][j] != '.'){
                    boolean isPresentInRow = rowSet[i].contains(board[i][j]);
                    boolean isPresentInCol = colSet[j].contains(board[i][j]);
                    boolean isPresentInGrid = gridSet[gridNo].contains(board[i][j]);

                    if(isPresentInRow || isPresentInCol || isPresentInGrid)
                    return false;

                }
            }

        }
        return true;
    }

}
