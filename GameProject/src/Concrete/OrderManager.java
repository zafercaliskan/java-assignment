package Concrete;

import java.util.ArrayList;
import java.util.List;

import Abstract.OrderService;
import Entities.Game;
import Entities.Gamer;
import Entities.Order;



public class OrderManager implements OrderService {

	private List<Order> orders = new ArrayList<Order>();

	public OrderManager() {
		Order order1 = new Order(1, 1, 1, 1, 2, 90, 50, 45);
		Order order2 = new Order(2, 2, 2, 2, 2, 100, 25, 75);
		Order order3 = new Order(3, 3, 3, 3, 2, 200, 75, 50);

		orders.add(order1);
		orders.add(order2);
		orders.add(order3);
	}

	@Override
	public void add(Order order) {
		printAllItems();		
		orders.add(order);
		printAllItems();
	}

	@Override
	public void update(Order order) {
		
		printAllItems();
		
		Order orderToUpdate = orders.stream()                
        		.filter(o -> o.getId() == order.getId())
                .findFirst()
                .orElse(null);
        
        if(orderToUpdate != null){   
        	
        	orderToUpdate.setGamerId(order.getGamerId());
        	orderToUpdate.setAmountOfPayment(order.getAmountOfPayment());
        	orderToUpdate.setCampaignId(order.getCampaignId());
        	orderToUpdate.setCount(order.getCount());
        	orderToUpdate.setDiscountAmount(order.getDiscountAmount());
        	orderToUpdate.setGameId(order.getGameId());
        	orderToUpdate.setId(order.getId());
        	orderToUpdate.setTotalAmount(order.getTotalAmount());
        	

        	printAllItems();
        }
        else {
        	System.out.println("Bulunamadı.");
        }
	}

	@Override
	public void delete(int orderId) {
		
		Order gameToDelete = orders.stream()                
        		.filter(s -> s.getId() == orderId)
                .findFirst()
                .orElse(null);
		
        if(gameToDelete != null){
        	printAllItems();
        	orders.remove(gameToDelete);        	
        	printAllItems();
        }
        else {
        	System.out.println("Bulunamadı.");
        }	
	}

	@Override
	public void printAllItems() {
		System.out.println("-----------------------------------------");
    	for (Order item : orders) {
			System.out.println("Id: " + item.getId() + " GamerId: " + item.getGamerId() + " GameId: " + item.getGameId() 
			+ " CampaignId: " + item.getCampaignId() + " AmountOfPayment:" + item.getAmountOfPayment() + " DiscountAmount:" + item.getDiscountAmount() +
			" Count:" + item.getCount() + " TotalAmount:" + item.getTotalAmount());
		}
    	System.out.println("-----------------------------------------");
		
	}
}
