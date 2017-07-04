package example.codeclan.com.rockpaperscissors;

import java.util.Random;

import behaviours.Move;

/**
 * Created by user on 22/06/2017.
 */

public class Computer {

    public Move getMove(){
        Move[] moves = Move.values();
        Random random = new Random();
        int index = random.nextInt(moves.length);
        return moves[index];
    }
}
