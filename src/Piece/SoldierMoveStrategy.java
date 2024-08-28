package Piece;

import Board.Board;
import Cell.Cell;

public class SoldierMoveStrategy extends IPieceMoveStrategy {

    @Override
    public Boolean canMove(Board board, Cell end, Cell start) {
        if(end.getRow() >= board.getChessBoard().length || end.getRow() < 0
         || end.getCol() >= board.getChessBoard()[end.getRow()].length || end.getCol() < 0
        ) {
            return false;
        }
        if(end.getRow()-start.getRow()==1 && end.getCol()==start.getCol()) {
            return true;
        }
        else return end.getRow() - start.getRow() == 1 &&
                (end.getCol() - start.getCol() == 1 || end.getCol() - start.getCol() == -1);
    }
}
