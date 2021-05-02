import Concrete.GamerCheckManager;
import Concrete.GamerManager;
import Concrete.MernisManager;
import Concrete.SellManager;

public class Main {

	public static void main(String[] args) {
	
		GamerManager gamerManager = new GamerManager(new GamerCheckManager());
		gamerManager.add(null);

	}

}
