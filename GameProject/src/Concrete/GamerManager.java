package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {
	
	private GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {		
		
		if(gamerCheckService.check(gamer)) {
			System.out.println(gamer.getFullName() + " eklendi.");
		}
		else {
			System.out.println("Bilgileriniz doğrulanmadı");
		}				
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFullName() + " güncellendi.");
		
	}

	@Override
	public void delete(int gamerId) {
		System.out.println(gamerId+ " idli gamer silindi.");		
	}
}