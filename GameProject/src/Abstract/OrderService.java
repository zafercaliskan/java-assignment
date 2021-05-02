package Abstract;

import Entities.Order;

public interface OrderService {
	void add(Order order);
	void update(Order order);
	void delete(int orderId);
}