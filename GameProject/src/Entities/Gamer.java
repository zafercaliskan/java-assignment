package Entities;

import Abstract.Entity;

public class Gamer implements Entity {
	private int id;
	private long nationalityId;	
	private String firstName;
	private String lastName;
	private int dateOfBirth;
	
	public Gamer() {
		super();
	}
	

	public Gamer(long nationalityId, String firstName, String lastName, int dateOfBirth) {
		super();
		this.nationalityId = nationalityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}


	public Gamer(int id, long nationalityId, String firstName, String lastName, int dateOfBirth) {
		super();
		this.id = id;
		this.nationalityId = nationalityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(long nationalityId) {
		this.nationalityId = nationalityId;
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

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}	
	
	public String getFullName() {
		return firstName + " " + lastName;
	}
}