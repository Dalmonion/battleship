package com.globallogic.battleship;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class BattleshipApplication {

	public static void main(String[] args) {
//		SpringApplication.run(BattleshipApplication.class, args);
		Board board = new Board();
		board.createBoard();
		System.out.println(board.toString());
	}

}
