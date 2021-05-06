package eCommerce.business.concretes;

import java.util.List;

import eCommerce.business.abstracts.AuthService;
import eCommerce.business.abstracts.UserService;
import eCommerce.core.utils.Utils;
import eCommerce.entities.concretes.LoginDto;
import eCommerce.entities.concretes.User;

public class AuthManager implements AuthService {
	
	private UserService userService;

	public AuthManager(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void register(User user) {	
		if(userValidate(user) 
				&& passwordValidate(user.getPassword()) 
				&& userExists(user.getePosta()) == false 
				&& Utils.emailValidate(user.getePosta())) 
		{
			userService.add(user);	
		}
		else {
			System.out.println("Kayıt başarısız!");
		}	
	}

	@Override
	public void verify(User user, String token) {
		if(user != null && token.length() > 15) {			
			User existUser= userService.get(user.getePosta());
			existUser.setVerify(true);
			
			userService.update(existUser);	
			
			System.out.println("Email doğrulandı.");
		}
		else {
			System.out.println("Email doğrulanamadı.");
		}	
	}	

	@Override
	public void login(LoginDto dto) {
		User user = userService.get(dto.getEmail());
		
		if(user != null && user.getPassword().equals(dto.getPassword())) {
			System.out.println("Başarıyla giriş yaptınız.");				
		}
		else {
			System.out.println("Kullanıcı adı veya şifren yanlış.!");
		}	
	}

	@Override
	public boolean userExists(String email) {
		User user=userService.get(email);

		if(user == null) {
			return false;
		}
		
		else {
			System.out.println("Email zaten mevcut.!" + email);		
			return true;
		}		
	}
	
	public boolean userValidate(User user) {	
		if(user != null && !user.getName().isEmpty() && !user.getLastName().isEmpty()
				&& !user.getePosta().isEmpty()	&& !user.getPassword().isEmpty()) {
			return true;			
		}
		
		System.out.println("Boş alan bırakmayınız.");
		
		return false;		
	}
	
	public boolean passwordValidate(String password) {
		
		if(password.length() >= 6 ) {
			return true;
		}
		
		System.out.println("Şifreniz 6 karakterden dhaa uzun olmalıdır.");
		
		return false;
	}
}