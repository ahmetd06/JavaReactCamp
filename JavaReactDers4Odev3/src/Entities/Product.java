package Entities;

import Abstract.IEntity;

public class Product implements IEntity {
	private int id;
	private String name;
	private int categoryId;
	private double unitPrice;
	private double kdv;
	private String detail;

	public Product() {
	}  

	public Product(int id, String name, int categoryId, double unitPrice, double kdv, String detail) {
		super();
		this.id = id;
		this.name = name;
		this.categoryId = categoryId;
		this.unitPrice = unitPrice;
		this.kdv = kdv;
		this.detail = detail;
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

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getKdv() {
		return kdv;
	}

	public void setKdv(double kdv) {
		this.kdv = kdv;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	

}
