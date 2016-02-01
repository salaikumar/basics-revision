package in.salaikumar.oodesign.chess.chesspiece.corepieces;

import in.salaikumar.oodesign.chess.chesspiece.core.WarRole;
import in.salaikumar.oodesign.chess.chesspiece.core.Warrior;
import in.salaikumar.oodesign.chess.moves.possiblemovements.lshape.LShapeMovement;
import in.salaikumar.oodesign.chess.utils.Color;

public class Knight extends Warrior {
    public Knight(Color color){
        super(WarRole.KNIGHT,color);
        addMovementProperty(new LShapeMovement());
    }
}
