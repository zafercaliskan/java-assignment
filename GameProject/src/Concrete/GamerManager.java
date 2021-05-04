package Concrete;
import java.util.ArrayList;
import java.util.List;
import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;


public class GamerManager implements GamerService  {
	
	private GamerCheckService gamerCheckService;
	
	private List<Gamer> gamers = new ArrayList<Gamer>();

	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
		
		Gamer gamer1 = new Gamer(1,12311232232L,"Zafer","Çalışkan",1995);
		Gamer gamer2 = new Gamer(2,12311232232L,"Görkem","Bilim",1998);
		Gamer gamer3 = new Gamer(3,12311232232L,"Sadık","Ortaoglan",1996);
		
		gamers.add(gamer1);					
		gamers.add(gamer2);		
		gamers.add(gamer3);
	}

	@Override
	public void add(Gamer gamer) {	
		
		if(gamerCheckService.check(gamer)) {					
			printAllItems();		
			gamers.add(gamer);		
			printAllItems();		
		}
		else {
			System.out.println("Doğrulanamadı!");
		}

	}

	@Override
	public void update(Gamer gamer) {		

		printAllItems();
		
        Gamer gamerToUpdate = gamers.stream()                
        		.filter(g -> g.getId() == gamer.getId())
                .findFirst()
                .orElse(null);
        
        if(gamerToUpdate != null){
        	System.out.println("Bulundu: " + gamerToUpdate.getFullName());
        	
        	gamerToUpdate.setNationalityId(gamer.getNationalityId());
        	gamerToUpdate.setLastName(gamer.getLastName());
        	gamerToUpdate.setFirstName(gamer.getFirstName());
        	gamerToUpdate.setLastName(gamer.getLastName());
        	gamerToUpdate.setDateOfBirth(gamer.getDateOfBirth());

        	System.out.println("Güncellendi: "+ gamerToUpdate.getFullName());  
        	printAllItems();
        }
        else {
        	System.out.println("Bulunamadı.");
        }	
	}

	@Override
	public void delete(int gamerId) {
		Gamer gamerToDelete = gamers.stream()                
        		.filter(s -> s.getId() == gamerId)
                .findFirst()
                .orElse(null);
		
        if(gamerToDelete != null){
        	System.out.println("Silindi: "+ gamerToDelete.getFullName());
        	gamers.remove(gamerToDelete);
        	printAllItems();
        
        }
        else {
        	System.out.println("Bulunamadı.");
        }		
	}

	@Override
	public void printAllItems() {
		System.out.println("-----------------------------------------");
    	for (Gamer item : gamers) {
			System.out.println(item.getFullName());
		}
    	System.out.println("-----------------------------------------");		
	}
}