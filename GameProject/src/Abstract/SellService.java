package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SellService {
	void buy(Gamer gamer, Game game, Campaign campaign);
	void buy(Gamer gamer, Game game);
}