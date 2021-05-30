package Entities;

import Abstract.IEntity;

public class Campaign implements IEntity {
	private int id;
	public Campaign(int id, String name, int discountPercent) {
		super();
		this.id = id;
		this.name = name;
		this.discountPercent = discountPercent;
	}

	private String name;
	private int discountPercent;

	public Campaign() {}

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

	public int getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}
	
}
