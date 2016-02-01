package in.salaikumar.oodesign.chess.moves;

import in.salaikumar.oodesign.chess.moves.Direction;

/**
 * Defines the all set of Movement Properties
 */
public interface Movement {

    public Direction direction = null;
    public boolean multisteps = false;
    public boolean backwardPossible = true;


}
