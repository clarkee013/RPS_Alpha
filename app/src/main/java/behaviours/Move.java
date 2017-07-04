package behaviours;

/**
 * Created by user on 22/06/2017.
 */

public enum Move {
    ROCK("rockButton"),
    PAPER("paperButton"),
    SCISSORS("scissorsButton");

    private String type;

    Move(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }


}
