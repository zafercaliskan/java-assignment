public class Main {
	public static void main(String[] args) {
		
		Kullanici sadik=new Kullanici();
		sadik.setAdi("sadik");
		sadik.setSoyadi("Ortaoglan");
		sadik.setKullanciAdi("sadik");
		sadik.setSifre("1234567");		
		
		Kullanici gorkem=new Kullanici();
		gorkem.setAdi("Görkem");
		gorkem.setSoyadi("Bilim");
		gorkem.setKullanciAdi("gorkembilim");
		gorkem.setSifre("12345678");		
		
		Kullanici zafer=new Kullanici();
		zafer.setAdi("zafer");
		zafer.setSoyadi("çalışkan");
		zafer.setKullanciAdi("zafercaliskan");
		zafer.setSifre("123456789");
		
		KullaniciManager kullaniciManager = new KullaniciManager();
		kullaniciManager.add(zafer);
		
		LoginManager loginManager=new LoginManager();
		loginManager.giris(zafer);
		
		
		Kullanici[] kullanicilar= { sadik, gorkem, zafer  };
		kullaniciManager.addMultiple(kullanicilar);
		
		Egitmen egitmen = new Egitmen(123123,"Yazılım");	
		egitmen.setAdi("Engin");
		egitmen.setSoyadi("Demirog");

		EgitmenManager egitmenManager= new EgitmenManager();
		egitmenManager.add(egitmen);
		
		Ders ders = new Ders(1234, "Java", egitmen.getEgitmenId());
		DersManager dersManager=new DersManager();	 
		dersManager.add(ders);	
	}
}