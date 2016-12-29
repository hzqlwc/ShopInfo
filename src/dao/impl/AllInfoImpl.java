package dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.AllInfo;
import entity.Baseshop;
import entity.Sell;
import entity.Stock;

public class AllInfoImpl extends HibernateDaoSupport implements AllInfo{
     
	@Override
	public List<Baseshop> getinfo(Baseshop baseshop) {
		// TODO Auto-generated method stub
		
		List<Baseshop> list = super.getHibernateTemplate()
				.find("from Baseshop");

		if (baseshop != null) {
			
			list = super
					.getHibernateTemplate()
					.find("from Baseshop where shopcode like ?",
							new Object[] { baseshop.getShopcode()+ "%"});
		}

		return list;

	}

	@Override
	public Baseshop shopcodes(String shopcode) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Baseshop.class, shopcode);
	}

	@Override
	public void addshops(Baseshop baseshop) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(baseshop);
	}



	@Override
	public List<Stock> getStockinfo() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Stock");
	}

	@Override
	public List<Sell> getSellinfo() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Sell");
	}

	@Override
	public void addStocks(Stock stock) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(stock);
	}

	@Override
	public void addSells(Sell sell) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(sell);
	}

	@Override
	public void delete(String shopcode) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(this.shopcodes(shopcode));
	}

	@Override
	public void saveOrUpdate(Baseshop baseshop) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(baseshop);
	}

}
