package in.salaikumar.oodesign.chess.moves.possiblemovements.diagonal;

import in.salaikumar.oodesign.chess.moves.core.Direction;
import in.salaikumar.oodesign.chess.moves.core.Movement;

public class MultiStepDiagonal extends Movement {

    public MultiStepDiagonal() {
        super(Direction.DIAGONAL, true, true);
    }
}
