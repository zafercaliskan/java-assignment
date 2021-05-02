import Concrete.GamerCheckManager;
import Concrete.GamerManager;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
	
		Gamer anil=new Gamer();
		anil.setId(1);
		anil.setFirstName("Anıl");
		anil.setLastName("Ağhan");
		anil.setTcNo("123456789112");
		
		GamerManager gamerManager = new GamerManager(new GamerCheckManager());
		gamerManager.add(anil);
	}

}
