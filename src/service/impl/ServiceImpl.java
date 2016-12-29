package service.impl;

import java.util.List;

import dao.AllInfo;

import entity.Baseshop;
import entity.Sell;
import entity.Stock;
import service.ServiceInfo;

public class ServiceImpl  implements ServiceInfo{
     private AllInfo allinfo;
     public AllInfo getAllinfo() {
 		return allinfo;
 	}

 	public void setAllinfo(AllInfo allinfo) {
 		this.allinfo = allinfo;
 	}
	@Override
	public List<Baseshop> serviceAllInfo(Baseshop baseshop) {
		// TODO Auto-generated method stub
		return this.allinfo.getinfo(baseshop);
	}

	@Override
	public Baseshop serviceshopcodes(String shopcode) {
		// TODO Auto-generated method stub
		return this.allinfo.shopcodes(shopcode);
	}

	@Override
	public void serviceaddshops(Baseshop baseshop) {
		this.allinfo.addshops(baseshop);
		
	}


	@Override
	public List<Stock> servicegetStockinfo() {
		// TODO Auto-generated method stub
		return this.allinfo.getStockinfo();
	}

	@Override
	public List<Sell> servicegetSellinfo() {
		// TODO Auto-generated method stub
		return this.allinfo.getSellinfo();
	}

	@Override
	public void addserviceStocks(Stock stock) {
		// TODO Auto-generated method stub
		this.allinfo.addStocks(stock);
	}

	@Override
	public void addserviceSells(Sell sell) {
		// TODO Auto-generated method stub
		this.allinfo.addSells(sell);
	}

	@Override
	public void deleteservice(String shopcode) {
		// TODO Auto-generated method stub
		this.allinfo.delete(shopcode);
	}

	@Override
	public void servicesaveOrUpdate(Baseshop baseshop) {
		// TODO Auto-generated method stub
		this.allinfo.saveOrUpdate(baseshop);
	}

	

}
