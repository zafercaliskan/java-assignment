package Entities;

import Abstract.Entity;

public class Gamer implements Entity {
	private int id;
	private String tcNo;
	private String firstName;
	private String lastName;
	
	public Gamer() {
		super();
	}

	public Gamer(int id, String tcNo, String firstName, String lastName) {
		super();
		this.id = id;
		this.tcNo = tcNo;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}