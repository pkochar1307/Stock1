package com.cg.stock.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.stock.dto.Client;
import com.cg.stock.service.StockService;

@Controller
public class MyController
{
	@Autowired
	StockService service;
	
	@RequestMapping("my")
	public String getAll(Model model)
	{
		System.out.println("Welcome to SharePrice");
		List<Client> list = service.getAll();
		model.addAttribute("list",list);
		System.out.println("Welcome");
		return "index";
	}
	
	
	@RequestMapping("setAnOrder")
	public String setOrder(@RequestParam("stockId") int sto,Model model)
	{
		Client cobj= service.getStock(sto);
		model.addAttribute("share",cobj);
		return "order";
	}
	
	
	@RequestMapping("giveOrder")
	public String placeOrder(@ModelAttribute("share") Client cli, 
			@RequestParam("qty") int qty,Model model)
	{
		
		double totalCost=cli.getQuote()*qty;
		model.addAttribute("cost",totalCost);
		model.addAttribute("stock",cli.getStock());
		return "summary";
	}
	
	
	
}
