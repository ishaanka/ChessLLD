package Cell;

import Piece.IPiece;

public class Cell {
    int row;
    int col;
    IPiece piece;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.piece = null;
    }

    public int getCol() {
        return col;
    }
    public int getRow() {
        return row;
    }
    public IPiece getPiece() {
        return piece;
    }
    public void setPiece(IPiece piece) {
        this.piece = piece;
    }
}
