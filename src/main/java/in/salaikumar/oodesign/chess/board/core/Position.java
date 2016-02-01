package in.salaikumar.oodesign.chess.board.core;

import in.salaikumar.oodesign.chess.board.core.CellPosition;
import in.salaikumar.oodesign.chess.utils.Color;
import in.salaikumar.oodesign.chess.chesspiece.core.Warrior;

/**
 * Position in the Chess Board
 */

public class Position {

    private  final CellPosition cellPosition;
    private  final Color color;
    private Warrior warrior;

    public Position(CellPosition cellPosition, Color color){
        this.cellPosition = cellPosition;
        this.color = color;
    }

    public Warrior getWarrior() {
        return warrior;
    }

    public void setWarrior(Warrior warrior) {
        this.warrior = warrior;
    }

    /*
     * Checks if the current Position is free
     */
    public boolean isEmpty(){
        return warrior == null;
    }

    @Override
    public String toString(){
        return null;
    }

    @Override
    public int hashCode(){
        return 0;
    }

    @Override
    public boolean equals(Object o){
        return false;
    }
}
