package in.salaikumar.oodesign.chess;

import java.util.ArrayList;
import java.util.List;

/**
 * Standard Chess Board
 */
public class Board {

    private List<List<Position>> board;

    public Board(){
        board = new ArrayList<List<Position>>(8);
        for ( int i = 0; i < board.size(); ++i){
            board.add(i, new ArrayList<Position>(8));
        }
    }

}
