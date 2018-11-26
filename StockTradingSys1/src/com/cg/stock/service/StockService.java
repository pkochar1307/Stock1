package com.cg.stock.service;

import java.util.List;

import com.cg.stock.dto.Client;



public interface StockService {
	
	public List<Client> getAll();
	
	public Client getStock(int stid);

}
