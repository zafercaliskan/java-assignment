package Entities;

import Abstract.Entity;

public class Campaign implements Entity {
	private int id;
	private String name;
	private int discountRate;	
	
	public Campaign() {
		super();
	}

	public Campaign(int id, String name, int discountRate) {
		super();
		this.id = id;
		this.name = name;
		this.discountRate = discountRate;
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

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}	
}