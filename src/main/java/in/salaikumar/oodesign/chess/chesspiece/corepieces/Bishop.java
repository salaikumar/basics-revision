package in.salaikumar.oodesign.chess.chesspiece.corepieces;

import in.salaikumar.oodesign.chess.chesspiece.core.WarRole;
import in.salaikumar.oodesign.chess.chesspiece.core.Warrior;
import in.salaikumar.oodesign.chess.moves.possiblemovements.diagonal.MultiStepDiagonal;
import in.salaikumar.oodesign.chess.utils.Color;

public class Bishop extends Warrior {
    public Bishop(Color color){
        super(WarRole.BISHOP,color);
        addMovementProperty(new MultiStepDiagonal());
    }
}
