package Move;

import Board.Board;
import Cell.Cell;

public class Move {
    public void move(Board board, Cell start, Cell end) {
        if(start.getPiece().canMove(board,end,start)) {
            if (end.getPiece() != null) {
              //kill the piece and remove from board and player's list
            }
            end.setPiece(start.getPiece());
            start.setPiece(null);
        }
    }
}
