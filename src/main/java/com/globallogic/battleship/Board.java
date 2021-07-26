package com.globallogic.battleship;

import com.globallogic.battleship.entity.Ship;

import java.util.Arrays;

public class Board {

    private char board[][];
    private boolean isReady;


    void createBoard() {
        // dodać logikę uzupełnienia tablicy
        board = new char[10][10];


        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }

        isReady = false;
    }

    void addShip(Ship ship) {

    }

    @Override
    public String toString() {
        String result = "  A B C D E F G H I J\n";
        for (int i = 0; i < board.length; i++) {
            result += String.valueOf(i + 1) + " ";
            for (int j = 0; j < board.length; j++) {
                result += board[i][j] + " ";
            }
            result += "\n";
        }
        return result;
    }
}
