package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+" eklendi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+" güncellendi.");
		
	}

	@Override
	public void delete(int gameId) {
		System.out.println(gameId+" idli game silindi.");
		
	}

}
