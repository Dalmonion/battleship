package com.globallogic.battleship.entity;

public class Ship {
    private final int row;
    private final int column;
    private final int length;
    private final boolean isHorizontal;

    public Ship(int row, int column, int length, boolean isHorizontal) {
        this.row = row;
        this.column = column;
        this.length = length;
        this.isHorizontal = isHorizontal;
    }
}
