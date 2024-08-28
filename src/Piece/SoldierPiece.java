package Piece;

import Board.Board;
import Cell.Cell;

import java.awt.*;

public class SoldierPiece extends IPiece {
    public SoldierPiece(Boolean isWhite,IPieceMoveStrategy moveStrategy) {
        this.isWhite = isWhite;
        this.isKilled =false;
        this.moveStrategy = moveStrategy;
    }

    public Boolean isWhite() {
        return isWhite;
    }

    public void killPiece() {
        isKilled = true;
    }
    public Boolean isKilled() {
        return isKilled;
    }

    public Boolean canMove(Board board, Cell end, Cell start) {
        return moveStrategy.canMove(board, end, start);
    }
}
