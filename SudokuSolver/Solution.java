package SudokuSolver;

import java.util.*;
import java.lang.*;

class Solution {

    private boolean isSafe(char[][] board, int row, int col, char t){

        for(int i = 0; i<board[0].length; i++){

            //check in column if target is present
            if(board[row][i] == t) return false;

            //check in row if target is present
            if(board[i][col] == t) return false;

        }

        //check in grid if target is present
        int startRowOfGrid = (row/3) * 3;
        int startColOfGrid = (col/3) * 3;

        for(int i = startRowOfGrid; i < startRowOfGrid + 3; i++){
            for(int j = startColOfGrid; j < startColOfGrid + 3; j++){
                if(board[i][j] == t) return false;
            }
        }

        return true;
    }

    private boolean helper(char[][] board, int row, int col){

        if(row == board.length) return true;

        // for the next recursive call we will pass this
        int newRow = 0;
        int newCol = 0;

        if(col == board[0].length-1){
            //go to next row
            newRow = row + 1;
            newCol = 0;
        }else{
            //go one cell further
            newRow = row;
            newCol = col + 1;
        }

        if(board[row][col] == '.'){
            //empty cell
            for(char value = '1'; value <= '9'; value++){
                if(isSafe(board, row, col, value)){
                    board[row][col] = value;
                    if(helper(board, newRow, newCol)){
                        //if the placed value is correct
                        return true;
                    }else{
                        //backtrack
                        board[row][col] = '.';
                    }
                }
            }
        }
        else{
            //already filled
            if(helper(board, newRow, newCol)) return true;
        }
        return false;
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows of sudoku: ");
        int n=sc.nextInt();
        System.out.print("Enter the number of columns of sudoku: ");
        int m=sc.nextInt();
        if(m!=n)
        {
            System.out.println("For sudoku, number of rows must be equal to number of rows");
            return;
        }
        String [][]arr=new String[n][m];
        System.out.println("Enter the values  of the sudoku table where is represented as '.': ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=sc.next();
            }
        }
    }
}
