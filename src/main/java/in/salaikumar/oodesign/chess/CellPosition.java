package in.salaikumar.oodesign.chess;

/**
 * Cell Position Class
 */
public class CellPosition {
    private final int row;
    private final int col;

    public CellPosition(int row, int col){
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
