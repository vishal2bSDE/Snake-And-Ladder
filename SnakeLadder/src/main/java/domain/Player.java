package main.java.domain;

public class Player {

	private final String name;
	private int cell;
	public Player(String name, int cell) {
		super();
		this.name = name;
		this.cell = cell;
	}
	public int getCell() {
		return cell;
	}
	public void setCell(int cell) {
		this.cell = cell;
	}
	
	public String getName() {
		return name;
	}
}
