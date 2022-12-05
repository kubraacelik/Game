package Entities;

public class Game {
	
	public int Id;
	public String gameName;
	public int Price;
	
	public Game(int id, String gameName, int price) {
		super();
		Id = id;
		this.gameName = gameName;
		Price = price;
	}
}
