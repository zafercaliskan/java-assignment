package eCommerce.core;

import eCommerce.amazonEmail.AmazonMailManager;

public class AmazonMailManagerAdapter implements EmailService{

	private AmazonMailManager amazonMailManager;
	
	public AmazonMailManagerAdapter() {
		amazonMailManager = new AmazonMailManager();
	}

	@Override
	public void send(String email, String message) {
		amazonMailManager.send(email, message);
	}
}