package shopAction;

import java.util.List;

import service.ServiceInfo;

import com.opensymphony.xwork2.ActionSupport;

import entity.Sell;
import entity.Stock;

public class StockAction extends ActionSupport{
	private List<Stock> stocklist;
	private ServiceInfo serviceInfo;
	private Stock stock;
	
	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public ServiceInfo getServiceInfo() {
		return serviceInfo;
	}

	public void setServiceInfo(ServiceInfo serviceInfo) {
		this.serviceInfo = serviceInfo;
	}

	public List<Stock> getStocklist() {
		return stocklist;
	}

	public void setStocklist(List<Stock> stocklist) {
		this.stocklist = stocklist;
	}
	
	
	public String execute(){
		stocklist=this.serviceInfo.servicegetStockinfo();
		return SUCCESS;

	}
	
	public String addStocks(){
		
		this.serviceInfo.addserviceStocks(stock);
		return SUCCESS;
	}
	
	
}
