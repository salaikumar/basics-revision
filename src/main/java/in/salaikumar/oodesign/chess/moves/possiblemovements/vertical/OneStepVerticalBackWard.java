package in.salaikumar.oodesign.chess.moves.possiblemovements.vertical;

import in.salaikumar.oodesign.chess.moves.core.Direction;
import in.salaikumar.oodesign.chess.moves.core.Movement;

/**
 * OneStepWithBackward Movement
 * Warrior uses this: KING.
 * Possible KING Instances: WhiteKing, BlackKing
 */
public class OneStepVerticalBackWard extends Movement{
    public OneStepVerticalBackWard() {
        super(Direction.VERTICAL, false, true);
    }
}
