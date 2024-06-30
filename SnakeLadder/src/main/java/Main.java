package main.java;

import java.util.List;

import main.java.domain.Player;
import main.java.service.BoardService;

public class Main {

	private static BoardService boardService;
	public static void main(String[] args) {
		System.out.println("Snake & ladder started");
		
		boardService=new BoardService();
		
		addPlayer("user1");
		addPlayer("user2");
		
		addSnakes(new int[][] {{3,2},{40,20},{20,5},{99,50},{98,2}});
		
		addLadders(new int[][] {{10, 15},{20,98},{2,5},{9,50},{8,29}});
		
		playTheGame();
		System.out.println("Snake & ladder stopped");
	}
	private static void playTheGame() {
		List<Player> list=boardService.getPlayers();
		while(true) {
			boolean flag=false;
			for(Player p:list) {
				int dice=6;
				while(dice==6) {
					dice=boardService.rollTheDice();
					if(p.getCell()+dice<100) {
						p.setCell(p.getCell()+dice);
						System.out.println(p.getName()+" rolled dice, "+(p.getCell()));
					} else if(p.getCell()+dice==100) {
						flag=true;
						System.out.println(p.getName()+" rolled dice, "+(p.getCell()+dice));
						System.out.println(p.getName()+" won");
						break;
					}
				}
				if(flag)break;
			}
			if(flag) {
				System.out.println("Game Ended");
				break;
			}
		}
	}
	private static void addLadders(int[][] ladders) {
		for(int[] ladder: ladders) {
			boardService.addLadder(ladder);
		}
	}
	private static void addSnakes(int[][] snakes) {
		for(int[] snake: snakes) {
			boardService.addSnake(snake);
		}
	}
	private static void addPlayer(String userName) {
		boardService.addPlayer(userName);
	}
	
	

}
