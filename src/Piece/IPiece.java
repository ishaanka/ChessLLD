package Piece;

import Board.Board;
import Cell.Cell;

public abstract class IPiece {
    Boolean isWhite;
    Boolean isKilled;
    IPieceMoveStrategy moveStrategy;
    public abstract Boolean canMove(Board board, Cell end, Cell start);
}
