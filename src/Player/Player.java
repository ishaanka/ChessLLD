package Player;

import Piece.IPiece;

import java.util.List;

public class Player {
    String name;
    Boolean isWhite;
    List<IPiece> pieceList;

    Player(Boolean isWhite, String name) {
        this.isWhite = isWhite;
        this.name = name;
    }

    public void updatePieceList(List<IPiece> pieceList) {
        this.pieceList = pieceList;
    }
}
