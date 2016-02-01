package in.salaikumar.oodesign.chess.chesspiece.corepieces;

import in.salaikumar.oodesign.chess.moves.core.Movement;
import in.salaikumar.oodesign.chess.moves.possiblemovements.diagonal.OneStepDiagonal;
import in.salaikumar.oodesign.chess.moves.possiblemovements.diagonal.OneStepDiagonalBackward;
import in.salaikumar.oodesign.chess.moves.possiblemovements.horizontal.OneStepHorizontal;
import in.salaikumar.oodesign.chess.moves.possiblemovements.vertical.OneStepVertical;
import in.salaikumar.oodesign.chess.moves.possiblemovements.vertical.OneStepVerticalBackWard;
import in.salaikumar.oodesign.chess.utils.Color;
import in.salaikumar.oodesign.chess.chesspiece.core.WarRole;
import in.salaikumar.oodesign.chess.chesspiece.core.Warrior;

import java.util.List;

/**
 * King
 */
public abstract class King extends Warrior {

    protected King(Color color){
        super(WarRole.KING,color);
        addMovementProperty(new OneStepHorizontal());
        addMovementProperty(new OneStepDiagonal());
        addMovementProperty(new OneStepDiagonalBackward());
        addMovementProperty(new OneStepVertical());
        addMovementProperty(new OneStepVerticalBackWard());
    }


}
