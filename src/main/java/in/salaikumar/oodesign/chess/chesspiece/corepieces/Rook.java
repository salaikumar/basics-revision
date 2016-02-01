package in.salaikumar.oodesign.chess.chesspiece.corepieces;


import in.salaikumar.oodesign.chess.chesspiece.core.WarRole;
import in.salaikumar.oodesign.chess.chesspiece.core.Warrior;
import in.salaikumar.oodesign.chess.moves.possiblemovements.horizontal.MultiStepHorizontal;
import in.salaikumar.oodesign.chess.moves.possiblemovements.vertical.MultiStepVertical;
import in.salaikumar.oodesign.chess.utils.Color;

public class Rook extends Warrior {
    public Rook(Color color){
        super(WarRole.ROOK,color);
        addMovementProperty(new MultiStepHorizontal());
        addMovementProperty(new MultiStepVertical());
    }
}
