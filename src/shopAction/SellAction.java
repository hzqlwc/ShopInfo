package shopAction;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import service.ServiceInfo;

import entity.Sell;

public class SellAction extends ActionSupport {
	private List<Sell> selllist;
	private ServiceInfo serviceInfo;
	
	public List<Sell> getSelllist() {
		return selllist;
	}

	public void setSelllist(List<Sell> selllist) {
		this.selllist = selllist;
	}

	public ServiceInfo getServiceInfo() {
		return serviceInfo;
	}

	public void setServiceInfo(ServiceInfo serviceInfo) {
		this.serviceInfo = serviceInfo;
	}
	
	
	public String execute(){
		selllist=this.serviceInfo.servicegetSellinfo();
		return SUCCESS;

	}
	
}
