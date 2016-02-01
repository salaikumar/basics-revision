package in.salaikumar.oodesign.chess.moves.possiblemovements.diagonal;

import in.salaikumar.oodesign.chess.moves.core.Direction;
import in.salaikumar.oodesign.chess.moves.core.Movement;

public class OneStepDiagonalBackward extends Movement {
    public OneStepDiagonalBackward(){
        super(Direction.DIAGONAL,false,true);
    }
}
