package com.notificationService.bean;

import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class Transaction {

	private String userId;
	private double amount;
	private String currency;
	private long timestamp;
	
	@Override
	public String toString() {
		return "Transaction [userId=" + userId + ", amount=" + amount + ", currency=" + currency + ", timestamp="
				+ timestamp + "]";
	}
	public Transaction(String userId, double amount, String currency, long timestamp) {
		super();
		this.userId = userId;
		this.amount = amount;
		this.currency = currency;
		this.timestamp = timestamp;
	}
	@Override
	public int hashCode() {
		return Objects.hash(amount, currency, timestamp, userId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
				&& Objects.equals(currency, other.currency) && timestamp == other.timestamp
				&& Objects.equals(userId, other.userId);
	}
	public String getUserId() {
		return userId;
	}
	public double getAmount() {
		return amount;
	}
	public String getCurrency() {
		return currency;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
}
