package eCommerce;

import eCommerce.business.concretes.AuthManager;
import eCommerce.business.concretes.UserManager;
import eCommerce.core.AmazonMailManagerAdapter;
import eCommerce.core.GoogleMailManagerAdapter;
import eCommerce.dataAccess.concretes.InMemoryUserDao;
import eCommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		//UserManager userManager=new UserManager(new InMemoryUserDao(), new AmazonMailManagerAdapter());
		User mert=new User(4, "Mert", "Çakmak", "mertcakmak@gmail.com", "123654", true);
		//userManager.add(mert);
		
		User enes = new User(2, "Hilmi", "Şafak", "hilmisafak@gmail.com", "147258", false);
		//userManager.update(enes);
		
		InMemoryUserDao inMemoryUserDao = new InMemoryUserDao();
		GoogleMailManagerAdapter googleMailManagerAdapter = new GoogleMailManagerAdapter();
		AmazonMailManagerAdapter amazonMailManagerAdapter = new  AmazonMailManagerAdapter();

		
		AuthManager authManager =new AuthManager(new UserManager(inMemoryUserDao, googleMailManagerAdapter));
		//authManager.register(mert);
		authManager.register(mert);
		UserManager userManager = new UserManager(inMemoryUserDao, amazonMailManagerAdapter);
		
		userManager.getAll();
		//userManager.getAll();		
		
	}
}