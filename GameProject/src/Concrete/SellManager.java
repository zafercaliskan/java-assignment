package Concrete;
import Abstract.SellService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SellManager implements SellService{

	@Override
	public void buy(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(game.getName() + " kütüphaneye eklendi.");		
	}
}