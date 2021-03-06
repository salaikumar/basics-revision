package in.salaikumar.oodesign.chess.chesspiece.corepieces;

import in.salaikumar.oodesign.chess.chesspiece.core.WarRole;
import in.salaikumar.oodesign.chess.chesspiece.core.Warrior;
import in.salaikumar.oodesign.chess.moves.possiblemovements.diagonal.MultiStepDiagonal;
import in.salaikumar.oodesign.chess.moves.possiblemovements.horizontal.MultiStepHorizontal;
import in.salaikumar.oodesign.chess.moves.possiblemovements.vertical.MultiStepVertical;
import in.salaikumar.oodesign.chess.utils.Color;

public class Queen extends Warrior {
    public Queen(Color color){
        super(WarRole.QUEEN,color);
        addMovementProperty(new MultiStepDiagonal());
        addMovementProperty(new MultiStepHorizontal());
        addMovementProperty(new MultiStepVertical());
    }
}
