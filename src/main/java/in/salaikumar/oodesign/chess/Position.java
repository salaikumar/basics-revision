package in.salaikumar.oodesign.chess;

/**
 * Position in the Chess Board
 */

public class Position {
    private  final CellPosition cellPosition;
    private  final Color color;
    private  Warrior warrior;

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
}
