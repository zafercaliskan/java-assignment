import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerCheckManager;
import Concrete.GamerManager;
import Concrete.MernisManager;
import Concrete.OrderManager;
import Concrete.SellManager;
import Entities.Campaign;
import Entities.Gamer;
import Entities.Order;
import Entities.Game;

public class Main {

	public static void main(String[] args) {
		CampaignManager campaignManager=new CampaignManager();
		GameManager gameManager =new GameManager();
		GamerManager gamerManager = new  GamerManager(new MernisManager());
		OrderManager orderManager =new OrderManager();
		SellManager sellManager =new SellManager(orderManager);
		
		Campaign kampanya1=new Campaign (3,"test kampanya",100);
		Game game1 =new Game(1,"CSGO",25);

		//gameManager.delete(1);
		//campaignManager.add(kampanya);
		//campaignManager.update(kampanya);
		//campaignManager.delete(2);	
		
		Gamer zafer=new Gamer(4, 213123123L,"Zafer","Çalışkan",1995);
		
		//gamerManager.add(zafer);
		
		//Order order=new Order(1,2,3,4,5,50,25,75);
		Order order=new Order();
		//orderManager.add(order);
		//orderManager.update(order);
		//orderManager.delete(2);
		
		//sellManager.buy(zafer, game1); 
		//sellManager.buy(zafer, game1, kampanya1);
		
	
		
	}
}