
public class Kurs {
	private int id;
	private int egitmenId;
	private String ad;
	private String detay;
	
	public Kurs() {
		super();
	}

	public Kurs(int id, int egitmenId, String ad, String detay) {
		super();
		this.id = id;
		this.egitmenId = egitmenId;
		this.ad = ad;
		this.detay = detay;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEgitmenId() {
		return egitmenId;
	}

	public void setEgitmenId(int egitmenId) {
		this.egitmenId = egitmenId;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getDetay() {
		return detay;
	}

	public void setDetay(String detay) {
		this.detay = detay;
	}
	
	
}
