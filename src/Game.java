import Board.Board;

import java.util.ArrayDeque;
import java.util.Deque;

import Player.Player;

public class Game {
    Deque<Player> players;
    Board board;
    Boolean isWinner = false;

    public Game() {
        players = new ArrayDeque<Player>();
        board = new Board();
        board.initializeBoard();
        isWinner = false;
    }

    public void addPieces() {
        //add pieces on cells and add in player's list
    }

    public void playGame() {
       while(!isWinner) {
           Player currentPlayer = players.poll();
           players.add(currentPlayer);

           // Move the desired object

           // check if winner
       }

    }

    public Boolean isWinner() {
        // Check king is not under attack and can move or defend
        return isWinner;
    }
}
