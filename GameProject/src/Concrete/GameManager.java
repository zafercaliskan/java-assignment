package Concrete;

import java.util.ArrayList;
import java.util.List;

import Abstract.GameService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class GameManager implements GameService{
	private List<Game> games = new ArrayList<Game>();

	public GameManager() {
		Game games1 = new Game(1, "Pubg", 90);
		Game games2 = new Game(2, "CSGO", 25);
		Game games3 = new Game(3, "Valorant", 10);
		
		games.add(games1);					
		games.add(games2);		
		games.add(games3);		
	}
	

	@Override
	public void add(Game game) {
		printAllItems();
		games.add(game);	
		printAllItems();
	}

	@Override
	public void update(Game game) {
		
        Game gameToUpdate = games.stream()                
        		.filter(s -> s.getId() == game.getId())
                .findFirst()
                .orElse(null);
        
        if(gameToUpdate != null){
        	printAllItems();

        	System.out.println("Bulundu: " + gameToUpdate.getId() + " " +       
        			gameToUpdate.getName() + " " + gameToUpdate.getPrice());
        	
        	gameToUpdate.setName(game.getName());
        	gameToUpdate.setPrice(game.getPrice());

        	
        	System.out.println("Güncellendi: " + gameToUpdate.getId() + " " +       
        			gameToUpdate.getName() + " " + gameToUpdate.getPrice());   
        	printAllItems();
        }
        else {
        	System.out.println("Bulunamadı.");
        }	
		
	}

	@Override
	public void delete(int gameId) {
		printAllItems();

		Game gameToDelete = games.stream()                
        		.filter(s -> s.getId() == gameId)
                .findFirst()
                .orElse(null);
		
        if(gameToDelete != null){
        	System.out.println("Bulundu: " + gameToDelete.getId() + " " +       
        			gameToDelete.getName() + " " + gameToDelete.getPrice());
        	
        	games.remove(gameToDelete);
        	
        	printAllItems();
        }
        else {
        	System.out.println("Bulunamadı.");
        }		
	}


	@Override
	public void printAllItems() {
		System.out.println("-----------------------------------------");
    	for (Game game : games) {
			System.out.println(game.getId() + " " + game.getName() + " " + game.getPrice());
		}
    	System.out.println("-----------------------------------------");		
	}
}