package com.cg.stock.dto;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="stock_master")
public class Client
{
	@Id
	@Column(name="stock_code")
	@NotNull(message="Enter some Code")
	private int stockCode;
	
	@Column(name="stock_name")
	@NotEmpty(message="Enter Stock Name")
	private String stock;
	
	@Column(name="stock_quote")
	@NotEmpty(message="Enter Stock Quote")
	private double quote;
	
	public int getStockCode() {
		return stockCode;
	}
	public void setStockCode(int stockCode) {
		this.stockCode = stockCode;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public double getQuote() {
		return quote;
	}
	public void setQuote(double quote) {
		this.quote = quote;
	}
	@Override
	public String toString() {
		return "Client [stockCode=" + stockCode + ", stock=" + stock
				+ ", quote=" + quote + "]";
	}
	

}
