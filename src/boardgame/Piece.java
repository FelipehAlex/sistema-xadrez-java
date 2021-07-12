package boardgame;

public abstract class Piece {
    
    protected Position position;
    private Board borad;

    public Piece(Board borad) {
        this.borad = borad;
        position = null;
    }

    protected Board getBorad() {
        return borad;
    }
    
    public abstract boolean[][] possibleMoves(); 
    
    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }
    
    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat.length; j++) {
                if (mat[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
    
}
