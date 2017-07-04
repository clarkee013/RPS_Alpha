package example.codeclan.com.rockpaperscissors;

import android.widget.Button;

import behaviours.Move;

import static android.R.attr.button;
import static behaviours.Move.PAPER;
import static behaviours.Move.ROCK;
import static behaviours.Move.SCISSORS;

/**
 * Created by user on 22/06/2017.
 */

public class Game {

    private Player player;
    private Computer computer;


    public Game() {
        player = new Player();
        computer = new Computer();

    }

    public void playGame() {
        Move computerMove = computer.getMove();
        Move playerMove = player.getMove();
        System.out.println("You played " + playerMove.getType());
        System.out.println("Computer played " + computerMove.getType());
        int winner = compareMoves(playerMove, computerMove);
        displayWinner(winner);

    }

    public int compareMoves(Move playerMove, Move computerMove) {
        if (playerMove == computerMove) {
            return 0;
        }
        switch (playerMove) {
            case ROCK:
                return (computerMove == SCISSORS ? 1 : -1);
            case PAPER:
                return (computerMove == ROCK ? 1 : -1);
            case SCISSORS:
                return (computerMove == PAPER ? 1 : -1);
            default:
                return 0;
//            quite common to allocate a win to 1 and a loss to -1, draw is 0
        }
    }

    private void displayWinner(int result) {
        switch (result) {
            case 0:
                System.out.println("It's a draw");
                break;
            case 1:
                System.out.println("Player wins");
                break;
            case -1:
                System.out.println("Computer wins");
        }
    }


}
