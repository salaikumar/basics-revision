package in.salaikumar.oodesign.chess.moves.possiblemovements.horizontal;

import in.salaikumar.oodesign.chess.moves.core.Direction;
import in.salaikumar.oodesign.chess.moves.core.Movement;


/**
 * MultiStep Horizontal
 * Warriors: ROOK, QUEEN
 */
public class MultiStepHorizontal extends Movement {
    public MultiStepHorizontal(){
        super(Direction.HORIZONTAL,true,true);
    }
}
