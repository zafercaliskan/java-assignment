package Concrete;
import Abstract.OrderService;
import Abstract.SellService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Entities.Order;

public class SellManager implements SellService{
	private OrderService orderService;

	public SellManager(OrderService orderService) {
		this.orderService = orderService;
	}

	@Override
	public void buy(Gamer gamer, Game game, Campaign campaign) {
		
		int discountAmount=game.getPrice()*(campaign.getDiscountRate()/100);
		int amountOfPayment = game.getPrice() - discountAmount;
		Order order =new Order(1,gamer.getId(),game.getId(), campaign.getId(),1,game.getPrice(),
				discountAmount,amountOfPayment);
		
		orderService.add(order);	
	}

	@Override
	public void buy(Gamer gamer, Game game) {
		
		Order order =new Order();
		order.setId(1);
		order.setAmountOfPayment(game.getPrice());
		order.setCount(1);
		order.setGameId(game.getId());
		order.setGamerId(gamer.getId());
		order.setTotalAmount(game.getPrice());		
		orderService.add(order);
		
	}
}