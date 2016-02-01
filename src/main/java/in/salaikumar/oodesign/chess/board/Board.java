package in.salaikumar.oodesign.chess.board;

import java.util.ArrayList;
import java.util.List;

/**
 * Standard Chess Board
 */
public class Board {

    private final List<List<Position>> board;

    public Board(){
        board = new ArrayList<List<Position>>(8);
        for ( int i = 0; i < board.size(); ++i){
            board.add(i, new ArrayList<Position>(8));
        }
    }

    @Override
    public String toString(){
        return null;
    }

    @Override
    public int hashCode(){
        return 0;
    }

    @Override
    public boolean equals(Object o){
        return false;
    }
}
