package main.java.domain;

import java.util.HashMap;
import java.util.Map;

public class Board {
	private Map<String, Player> players;
	private Map<Integer, Integer> snakesMap, laddersMap;
	public Board() {
		super();
		this.snakesMap = new HashMap();
		this.laddersMap = new HashMap();
		players=new HashMap();
	}
	public Map<String, Player> getPlayers() {
		return players;
	}
	public void setPlayers(Map<String, Player> players) {
		this.players = players;
	}
	public Map<Integer, Integer> getSnakesMap() {
		return snakesMap;
	}
	public void setSnakesMap(Map<Integer, Integer> snakesMap) {
		this.snakesMap = snakesMap;
	}
	public Map<Integer, Integer> getLaddersMap() {
		return laddersMap;
	}
	public void setLaddersMap(Map<Integer, Integer> laddersMap) {
		this.laddersMap = laddersMap;
	}
	
	
}
