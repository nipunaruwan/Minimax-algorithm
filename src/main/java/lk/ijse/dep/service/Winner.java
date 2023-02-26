package lk.ijse.dep.service;

import jdk.jfr.DataAmount;


public class Winner<Piece> {
   private Piece winningPiece;
    private static final int NUM_OF_COLS = 8;
    private static final int NUM_OF_ROWS = 8;
    private Piece[][] pieces;
    int col1;
    int row1;
    int col2;
    int row2;

    public Winner(Piece winningPiece) {
        this.pieces = new Piece[NUM_OF_COLS][NUM_OF_ROWS];
    }
}
