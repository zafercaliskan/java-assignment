package eCommerce.business.abstracts;

import java.util.List;

import eCommerce.entities.concretes.User;

public interface UserService {
	void add(User user);
	void add(String email);
	void update(User user);
	void delete(int userId);
	User get(String email);
	List<User> getAll();
}