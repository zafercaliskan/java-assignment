
public class Main {
	public static void main(String[] args) {
		Egitmen egitmen=new Egitmen();
		egitmen.setFirstName("Zafer");
		egitmen.setLastName("Çalışkan");
		
		EgitmenManager egitmenManager= new EgitmenManager();
		egitmenManager.Add(egitmen);
		
		Kurs kurs1 = new Kurs();
		kurs1.setAd("Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)");
		
		Kurs kurs2 = new Kurs();
		kurs2.setAd("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");
		
		KursManager kursManager =new KursManager();
		kursManager.Add(kurs1);
		
		Kurs[] kurslar = { kurs1, kurs2 };
		
		kursManager.AddMultiple(kurslar);
	}
}