package com.cg.stock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.stock.dao.StockDAO;
import com.cg.stock.dto.Client;

@Service("service")
@Transactional
public class StockServiceImpl implements StockService 
{
	@Autowired
	 StockDAO dao;
	
	@Override
	public List<Client> getAll() {
		
		return dao.getAll();
	}
	@Override
	public Client getStock(int stid) {
		
		return dao.getStock(stid);
	}

}
