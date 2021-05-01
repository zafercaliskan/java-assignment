public class LoginManager {
	
	
	public void giris(Kullanici kullanici) {
		
		
		if(kullanici.getKullanciAdi().equals("zafercaliskan") && kullanici.getSifre().equals("123456789"))
		{
			System.out.println(kullanici.getFullName() + " giriş yaptı.");	
		}
		
		else if(kullanici.getKullanciAdi().equals("zafercaliskan") && !kullanici.getSifre().equals("123456789") ) 
		{
			System.out.println("Şifrenizi yanlış girdiniz.");
		}
		
		else if(!kullanici.getKullanciAdi().equals("zafercaliskan") && kullanici.getSifre().equals("123456789") ) 
		{
			System.out.println("Kullanıcı adınızı yanlış girdiniz.");
		}
		
		else 
		{
			System.out.println("Kullanıcı adı ve şifrenizi yanlış girdiniz.");
		}
	}
}