import Concrete.GamerCheckManager;
import Concrete.GamerManager;
import Concrete.MernisManager;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
	
//		Gamer zafer=new Gamer();
//		zafer.setId(2);
//		zafer.setFirstName("Zafer2");
//		zafer.setLastName("Çalışkan2");
//		zafer.setNationalityId(10252702256L);
//		zafer.setDateOfBirth(1995);
//		
		GamerManager gamerManager = new GamerManager(new MernisManager());
		//gamerManager.add(zafer);
		//gamerManager.update(zafer);
		gamerManager.delete(2);
		
		
	}
}