package in.salaikumar.oodesign.chess.chesspiece.corepieces;


import in.salaikumar.oodesign.chess.chesspiece.core.WarRole;
import in.salaikumar.oodesign.chess.chesspiece.core.Warrior;
import in.salaikumar.oodesign.chess.moves.possiblemovements.diagonal.OneStepDiagonal;
import in.salaikumar.oodesign.chess.moves.possiblemovements.vertical.OneStepVertical;
import in.salaikumar.oodesign.chess.utils.Color;

public class Pawn extends Warrior {
    public Pawn(Color color){
        super(WarRole.PAWN,color);
        addMovementProperty(new OneStepVertical());
        addMovementProperty(new OneStepDiagonal());
    }
}
