package Board;
import Cell.Cell;

public class Board {
    Cell[][] chessBoard;

    public Board() {
        chessBoard = new Cell[8][8];
    }

    public void initializeBoard() {
       for(int i = 0; i < chessBoard.length; i++) {
           for(int j = 0; j < chessBoard[0].length; j++) {
               Cell cell = new Cell(i, j);
               chessBoard[i][j] = cell;
               // Can add pieces in initial Position
           }
       }
    }

    public Cell[][] getChessBoard() {
        return chessBoard;
    }
}
