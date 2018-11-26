package com.cg.stock.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;


import com.cg.stock.dto.Client;

@Repository("dao")
public class StockDAOImpl  implements StockDAO
{
	@PersistenceContext
	EntityManager manager;
	
	@Override
	public List<Client> getAll() {
		
		String str="select stock from Client stock";
		TypedQuery<Client> queryOne=(TypedQuery<Client>) manager.createQuery(str,Client.class);
		List<Client> myList=queryOne.getResultList();
		return myList;
		
	}

	@Override
	public Client getStock(int stid) {
		
		Client obj= manager.find(Client.class,stid);
	
		return obj;
	}

}
