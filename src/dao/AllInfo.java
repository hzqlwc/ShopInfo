package dao;

import java.util.List;

import entity.Baseshop;
import entity.Sell;
import entity.Stock;

public interface AllInfo {
   public List<Baseshop> getinfo(Baseshop baseshop); //��ѯ��Ʒ����Ϣ
   public Baseshop shopcodes(String shopcode);//���ݱ�Ų�ѯ��Ʒ��Ϣ
   public void addshops(Baseshop baseshop);//�����Ʒ��Ϣ
   public void saveOrUpdate(Baseshop baseshop);
   public List<Stock> getStockinfo();
   public void addStocks(Stock stock);//�����Ʒ��Ϣ
   public List<Sell> getSellinfo();
   public void addSells(Sell sell);//�����Ʒ��Ϣ
   
   public void delete(String shopcode) ;//���ݹ�ԱID��ɾ����Ա
}
