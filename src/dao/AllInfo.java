package dao;

import java.util.List;

import entity.Baseshop;
import entity.Sell;
import entity.Stock;

public interface AllInfo {
   public List<Baseshop> getinfo(Baseshop baseshop); //查询商品表信息
   public Baseshop shopcodes(String shopcode);//根据编号查询商品信息
   public void addshops(Baseshop baseshop);//添加商品信息
   public void saveOrUpdate(Baseshop baseshop);
   public List<Stock> getStockinfo();
   public void addStocks(Stock stock);//添加商品信息
   public List<Sell> getSellinfo();
   public void addSells(Sell sell);//添加商品信息
   
   public void delete(String shopcode) ;//根据雇员ID，删除雇员
}
