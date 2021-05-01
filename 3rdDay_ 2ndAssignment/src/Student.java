public class Student extends User {
	private int okulNumarasi;	
	private String okulAdi;
	
	public Student() {
		super();
	}

	public Student(int okulNumarasi, String okulAdi) {
		super();
		this.okulNumarasi = okulNumarasi;
		this.okulAdi = okulAdi;
	}

	public int getOkulNumarasi() {
		return okulNumarasi;
	}

	public void setOkulNumarasi(int okulNumarasi) {
		this.okulNumarasi = okulNumarasi;
	}

	public String getOkulAdi() {
		return okulAdi;
	}

	public void setOkulAdi(String okulAdi) {
		this.okulAdi = okulAdi;
	}
}