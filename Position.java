package src.wqu;

public class Position {
    // images are stored in an array
    public int row;
    public int col;

    public Position(int r, int c){
        row=r;
        col=c;
    }

    public boolean equals(Position other) {
        return row == other.row && col == other.col;
    }
}
