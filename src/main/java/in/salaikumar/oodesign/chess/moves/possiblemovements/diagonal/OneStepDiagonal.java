package in.salaikumar.oodesign.chess.moves.possiblemovements.diagonal;

import in.salaikumar.oodesign.chess.moves.core.Direction;
import in.salaikumar.oodesign.chess.moves.core.Movement;

/**
 * One Step Diagonal
 */
public class OneStepDiagonal extends Movement{
    public OneStepDiagonal(){
        super(Direction.DIAGONAL,false,false);
    }
}
