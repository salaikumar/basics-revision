package in.salaikumar.oodesign.chess.moves.core;

import in.salaikumar.oodesign.chess.moves.core.Direction;

/**
 * Defines the all set of Movement Properties
 */
public abstract class Movement {

    private final Direction direction;
    private final boolean multisteps;
    private final boolean backwardPossible;

    protected Movement(Direction direction, boolean multisteps, boolean backwardPossible) {
        this.direction = direction;
        this.multisteps = multisteps;
        this.backwardPossible = backwardPossible;
    }

    public final Direction getDirection(){
        return direction;
    }

    public final boolean isMultistepsPossible(){
        return multisteps;
    }

    public final boolean isBackwardPossible(){
        return backwardPossible;
    }
}
