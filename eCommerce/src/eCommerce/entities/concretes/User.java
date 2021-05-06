package eCommerce.entities.concretes;

import eCommerce.entities.abstracts.Entity;

public class User implements Entity {
	private int id;
	private String name;
	private String lastName;
	private String ePosta;
	private String password;
	private boolean isVerify;

	public User() {
		super();
	}

	public User(int id, String name, String lastName, String ePosta, String password, boolean isVerify) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.ePosta = ePosta;
		this.password = password;
		this.isVerify = isVerify;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getePosta() {
		return ePosta;
	}

	public void setePosta(String ePosta) {
		this.ePosta = ePosta;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isVerify() {
		return isVerify;
	}

	public void setVerify(boolean isVerify) {
		this.isVerify = isVerify;
	}
	
	public String getFullName() {
		return this.name + " " + this.lastName;
	}
}