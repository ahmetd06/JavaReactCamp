package Entities;

import java.time.LocalDate;

import Abstract.IEntity;

public class PrepaidGameCodeForGift extends Product implements IEntity{
private LocalDate expirationDate;
private double amount;
public PrepaidGameCodeForGift() {}
public PrepaidGameCodeForGift(LocalDate expirationDate, double amount) {
	super();
	this.expirationDate = expirationDate;
	this.amount = amount;
}
public LocalDate getExpirationDate() {
	return expirationDate;
}
public void setExpirationDate(LocalDate expirationDate) {
	this.expirationDate = expirationDate;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}

}
