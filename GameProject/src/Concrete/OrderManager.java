package Concrete;

import Abstract.OrderService;
import Entities.Order;

public class OrderManager implements OrderService {

	@Override
	public void add(Order order) {
		System.out.println(order.getId() + " idli siparişiniz eklenmiştir.");	
	}

	@Override
	public void update(Order order) {
		System.out.println(order.getId() + " idli siparişiniz güncellenmiştir.");	
	}

	@Override
	public void delete(int orderId) {
		System.out.println(orderId + " idli siparişiniz silinmiştir.");	
	}
}
