package service;

import java.util.List;

import entity.Baseshop;
import entity.Sell;
import entity.Stock;

public interface ServiceInfo {
    public List<Baseshop> serviceAllInfo(Baseshop baseshop);//��ѯ��Ʒ����Ϣ
	public Baseshop serviceshopcodes(String shopcode);//���ݱ�Ų�ѯ��Ʒ��Ϣ
	public void serviceaddshops(Baseshop baseshop);//�����Ʒ��Ϣ
	  public List<Stock> servicegetStockinfo();
	  public void addserviceStocks(Stock stock);//�����Ʒ��Ϣ
	   public List<Sell> servicegetSellinfo();
	   public void addserviceSells(Sell sell);//�����Ʒ��Ϣ
	   public void servicesaveOrUpdate(Baseshop baseshop);

	   public void deleteservice(String shopcode) ;//���ݹ�ԱID��ɾ����Ա
	   
}
