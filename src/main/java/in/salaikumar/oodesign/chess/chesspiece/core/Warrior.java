package in.salaikumar.oodesign.chess.chesspiece.core;

import in.salaikumar.oodesign.chess.utils.Color;
import in.salaikumar.oodesign.chess.moves.core.Movement;

import java.util.List;

/**
 * Warrior.
 * Every character is mentioned as Warrior.
 */
public abstract class Warrior {

    private final WarRole warRole;
    protected List<Movement> moveProperties;
    private Color color;

    protected Warrior(WarRole warRole, Color color) {
        this.warRole = warRole;

    }

    public final List<Movement> getMoveProperties() {
        return this.moveProperties;
    }

    public final WarRole getWarRole() {
        return this.warRole;
    }

    public final Color getColor() {
        return this.color;
    }

    protected final boolean addMovementProperty(Movement movement) {
        if (!moveProperties.contains(movement)) {
            moveProperties.add(movement);
            return true;
        }
        return false;
    }

}
