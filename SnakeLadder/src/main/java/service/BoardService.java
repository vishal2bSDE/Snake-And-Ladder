package main.java.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import main.java.domain.Board;
import main.java.domain.Player;

public class BoardService {

	private Board board;
	private Random random;
	
	public BoardService() {
		super();
		this.board = new Board();
		random = new Random();
	}


	public void addPlayer(String name) {
		board.getPlayers().put(name, new Player(name, 1));
		System.out.println("Player "+name+" is added to the board");
	}


	public void addSnake(int[] snake) {
		board.getSnakesMap().put(snake[0], snake[1]);
		System.out.println("Snake added to the board, "+snake);
	}


	public void addLadder(int[] ladder) {
		board.getLaddersMap().put(ladder[0], ladder[1]);
		System.out.println("Ladder added to the board, "+ladder);
	}


	public List<Player> getPlayers() {
		return new ArrayList(board.getPlayers().values());
	}


	public int rollTheDice() {
		return random.nextInt(6) + 1;
	}
	
	
}
