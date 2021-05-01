public class Kullanici {
	private int id;
	private String kullanciAdi;
	private String sifre;
	private String mail;
	private String adi;
	private String soyadi;
	
	
	public Kullanici() {
		super();
	}

	public Kullanici(int id, String kullanciAdi, String sifre, String mail, String adi, String soyadi) {
		super();
		this.id = id;
		this.kullanciAdi = kullanciAdi;
		this.sifre = sifre;
		this.mail = mail;
		this.adi = adi;
		this.soyadi = soyadi;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getKullanciAdi() {
		return kullanciAdi;
	}


	public void setKullanciAdi(String kullanciAdi) {
		this.kullanciAdi = kullanciAdi;
	}


	public String getSifre() {
		return sifre;
	}


	public void setSifre(String sifre) {
		this.sifre = sifre;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getAdi() {
		return adi;
	}


	public void setAdi(String adi) {
		this.adi = adi;
	}


	public String getSoyadi() {
		return soyadi;
	}


	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
		
	public String getFullName() {
		return adi + " " + soyadi;
	}
}