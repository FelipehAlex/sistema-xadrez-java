package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board borad, Color color) {
        super(borad, color);
    }

    @Override
    public String toString() {
        return "R";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean mat[][] = new boolean[getBorad().getRows()][getBorad().getColumns()];
        
        Position p = new Position(0, 0);
       
        // cima
        p.setValues(position.getRow() -1, position.getColumn());
        while (getBorad().positionExists(p) && !getBorad().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() -1);
        }
        if (getBorad().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        
        // esquerda
        p.setValues(position.getRow(), position.getColumn() -1);
        while (getBorad().positionExists(p) && !getBorad().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn() - 1);
        }
        if (getBorad().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        
        // direita
        p.setValues(position.getRow(), position.getColumn() +1);
        while (getBorad().positionExists(p) && !getBorad().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn() + 1);
        }
        if (getBorad().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        
        // baixo
        p.setValues(position.getRow() +1, position.getColumn());
        while (getBorad().positionExists(p) && !getBorad().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() +1);
        }
        if (getBorad().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        
        return mat;
    }
    
}
