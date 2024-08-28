package Piece;
import Board.Board;
import Cell.Cell;


public abstract class IPieceMoveStrategy {
    public abstract Boolean canMove(Board board, Cell end, Cell start);
}
