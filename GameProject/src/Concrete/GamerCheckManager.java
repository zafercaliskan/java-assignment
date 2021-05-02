package Concrete;

import Abstract.GamerCheckService;
import Entities.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean check(Gamer gamer) {
		//if(gamer.getTcNo().length()==11) { // 11 haneliyse true döndürür.
		if(gamer.getTcNo().equals("12345678911")) {
			return true;
		}
		else {
			return false;
		}		 		
	}
}