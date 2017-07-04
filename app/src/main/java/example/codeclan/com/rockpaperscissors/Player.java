package example.codeclan.com.rockpaperscissors;

import java.util.Scanner;

import behaviours.Move;

import static android.R.id.input;

/**
 * Created by user on 22/06/2017.
 */

public class Player {

    Move move;

    public Player(){

    }

    public Move getMove() {
        return move;
    }

    public void setMove(String choice){

        switch(choice){
            case "rockButton" :
                return Move.ROCK;
            case "paperButton" :
                return Move.PAPER;
            case "scissorButton" :
                return Move.SCISSORS;
//            single ' for character - " for string
            default:
                System.out.println("Invalid Choice");
                        return getMove();
        }
//        return null; --- can be placed outside of the case statement as well as the above default
    }


}
