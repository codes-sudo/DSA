package Arrays.twoPointers;

import java.util.HashSet;
import java.util.Set;

public class ValidSuduko {
    public boolean isValidSudoku(char[][] board) {

        int row = board.length;
        int col = board[0].length;
        int rowWise = 0;
        int colWise = 0;
        int boxL = 0;
        int boxR = 0;
        Set<Character> rowSet = null;
        Set<Character> colSet = null;

        for (int i = 0; i < row; i++) {
            rowSet = new HashSet<>();
            colSet = new HashSet<>();
            for (int j = 0; j < col ; j++) {
                if(board[i][j] != '.') {
                    if(rowSet.contains(board[i][j])) {
                        return false;
                    } else{
                        rowSet.add(board[i][j]);
                    }
                }

                if(board[j][i] != '.') {
                    if(colSet.contains(board[j][i])) {
                        return false;
                    } else{
                        colSet.add(board[j][i]);
                    }
                }
            }
        }


        for (int i = 0; i < row; i=i+3) {
            for (int j = 0; j < col ; j=j+3) {
                if(!checkBox(board, i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean checkBox(char[][] board, int indx, int jndx) {

        Set<Character> box = new HashSet<>();

        int row = indx + 3;
        int col = jndx + 3;

        for (int i = indx; i < row; i++) {
            for (int j = jndx; j < col; j++) {
                if (board[i][j] != '.') {
                    if (box.contains(board[i][j])) {
                        return false;
                    } else {
                        box.add(board[i][j]);
                    }

                }
            }
        }
        return true;
    }
}
