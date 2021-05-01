public class KullaniciManager {
	public void add(Kullanici kullanici) {
		System.out.println(kullanici.getFullName() + " eklendi.");
	}
	
	public void addMultiple(Kullanici[] kullanicilar) {
		for (Kullanici kullanici:kullanicilar) 
		{
			add(kullanici);
		}
	}
}