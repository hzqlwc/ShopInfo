package service;

import java.util.List;

import entity.Baseshop;
import entity.Sell;
import entity.Stock;

public interface ServiceInfo {
    public List<Baseshop> serviceAllInfo(Baseshop baseshop);//查询商品表信息
	public Baseshop serviceshopcodes(String shopcode);//根据编号查询商品信息
	public void serviceaddshops(Baseshop baseshop);//添加商品信息
	  public List<Stock> servicegetStockinfo();
	  public void addserviceStocks(Stock stock);//添加商品信息
	   public List<Sell> servicegetSellinfo();
	   public void addserviceSells(Sell sell);//添加商品信息
	   public void servicesaveOrUpdate(Baseshop baseshop);

	   public void deleteservice(String shopcode) ;//根据雇员ID，删除雇员
	   
}
