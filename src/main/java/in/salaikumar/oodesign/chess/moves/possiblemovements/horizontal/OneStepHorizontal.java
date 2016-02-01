package in.salaikumar.oodesign.chess.moves.possiblemovements.horizontal;

import in.salaikumar.oodesign.chess.moves.core.Direction;
import in.salaikumar.oodesign.chess.moves.core.Movement;

/**
 * One Step move
 * Without backward possibility
 * Warriors: PAWN
 */
public class OneStepHorizontal extends Movement {
    public OneStepHorizontal() {
        super(Direction.HORIZONTAL, false, false);
    }
}
