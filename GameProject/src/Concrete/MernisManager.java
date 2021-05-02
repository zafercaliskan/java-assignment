package Concrete;

import Abstract.GamerCheckService;
import Entities.Gamer;

public class MernisManager implements GamerCheckService{

	@Override
	public boolean check(Gamer gamer) {
		//Mernis bağlantısı eklenecek. 
		return false;
	}
}