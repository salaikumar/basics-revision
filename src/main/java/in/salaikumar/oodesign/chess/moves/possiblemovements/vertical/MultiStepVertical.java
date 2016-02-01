package in.salaikumar.oodesign.chess.moves.possiblemovements.vertical;

import in.salaikumar.oodesign.chess.moves.core.Direction;
import in.salaikumar.oodesign.chess.moves.core.Movement;

/**
 * Created by salaikumar on 1/2/16.
 */
public class MultiStepVertical extends Movement {
    public MultiStepVertical(){
        super(Direction.VERTICAL,true,true);
    }
}
