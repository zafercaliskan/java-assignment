public class Ders {
	private int dersId;
	private String adi;
	private int egitmenId;
	
	public Ders() {
		super();
	}

	public Ders(int dersId, String adi, int egitmenId) {
		super();
		this.dersId = dersId;
		this.adi = adi;
		this.egitmenId = egitmenId;
	}

	public int getDersId() {
		return dersId;
	}

	public void setDersId(int dersId) {
		this.dersId = dersId;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public int getEgitmenId() {
		return egitmenId;
	}

	public void setEgitmenId(int egitmenId) {
		this.egitmenId = egitmenId;
	}
}