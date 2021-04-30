import java.util.Iterator;

public class KursManager {
	public void Add(Kurs kurs) {
		System.out.println(kurs.getAd() + " kaydedildi.");
	}
	
	public void AddMultiple(Kurs[] kurslar) {
		for (Kurs kurs : kurslar) {
			System.out.println(kurs.getAd() + " kaydedildi.");
		}		
	}	
}