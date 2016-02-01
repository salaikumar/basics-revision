package in.salaikumar.oodesign.chess.warrior;

import in.salaikumar.oodesign.chess.utils.Color;
import in.salaikumar.oodesign.chess.moves.Movement;

import java.util.List;

/**
 * Warrior.
 * Every character is mentioned as Warrior.
 */
public interface Warrior {

    public final WarRole warRole = null;
    public final List<Movement> moveProperties = null;
    public final Color color = null;
    public List<Movement> getMoveProperties();
    public boolean addMovementProperty(Movement movement);
    public WarRole getWarRole();
    public Color getColor();

}
