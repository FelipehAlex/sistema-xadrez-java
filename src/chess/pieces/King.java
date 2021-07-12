package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{

    public King(Board borad, Color color) {
        super(borad, color);
    }
    
    @Override
    public String toString() {
        return "K";
    }
    
    private boolean canMove(Position position) {
        ChessPiece p = (ChessPiece)getBorad().piece(position);
        return p == null || p.getColor() != getColor();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean mat[][] = new boolean[getBorad().getRows()][getBorad().getColumns()];
        
        Position p = new Position(0, 0);
        
        // cima
        p.setValues(position.getRow() -1, position.getColumn());
        if (getBorad().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        
        // baixo
        p.setValues(position.getRow() +1, position.getColumn());
        if (getBorad().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        
        // esquerda
        p.setValues(position.getRow(), position.getColumn() -1);
        if (getBorad().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        
        // direita
        p.setValues(position.getRow(), position.getColumn() +1);
        if (getBorad().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        
        // nw
        p.setValues(position.getRow() -1, position.getColumn() -1);
        if (getBorad().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        
        // ne
        p.setValues(position.getRow() -1, position.getColumn() +1);
        if (getBorad().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        
        // sw
        p.setValues(position.getRow() +1, position.getColumn() -1);
        if (getBorad().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        
        // se
        p.setValues(position.getRow() +1, position.getColumn() +1);
        if (getBorad().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        
        return  mat;
    }
    
}
