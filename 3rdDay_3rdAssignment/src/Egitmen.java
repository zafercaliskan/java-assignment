public class Egitmen extends Kullanici{	
	private int egitmenId;
	private String brans;
	
	public Egitmen() {
		super();
	}

	public Egitmen(int egitmenId, String brans) {
		super();
		this.egitmenId = egitmenId;
		this.brans = brans;
	}

	public int getEgitmenId() {
		return egitmenId;
	}

	public void setEgitmenId(int egitmenId) {
		this.egitmenId = egitmenId;
	}

	public String getBrans() {
		return brans;
	}

	public void setBrans(String brans) {
		this.brans = brans;
	}		
}