package shopAction;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import service.ServiceInfo;

import entity.Baseshop;
import entity.Sell;
import entity.Stock;

public class ShopAction extends ActionSupport {
	
	private List<Baseshop> list;
	private ServiceInfo serviceInfo;
	
	private String shopcode;
	private Baseshop baseshop;
	
	
	public String getShopcode() {
		return shopcode;
	}

	public void setShopcode(String shopcode) {
		this.shopcode = shopcode;
	}

	public List<Baseshop> getList() {
		return list;
	}

	public void setList(List<Baseshop> list) {
		this.list = list;
	}
	public ServiceInfo getServiceInfo() {
		return serviceInfo;
	}

	public void setServiceInfo(ServiceInfo serviceInfo) {
		this.serviceInfo = serviceInfo;
	}
	public Baseshop getBaseshop() {
		return baseshop;
	}

	public void setBaseshop(Baseshop baseshop) {
		this.baseshop = baseshop;
	}
	
	
	
	public String selectallinfo(){
		list=this.serviceInfo.serviceAllInfo(baseshop);
		return SUCCESS;
	

	}
	//根据编号查询
	public String shopcodes(){
		baseshop=this.serviceInfo.serviceshopcodes(shopcode);
		
		return SUCCESS;
		
	}
//商品添加
	public String add(){
		
		this.serviceInfo.serviceaddshops(baseshop);		
		return SUCCESS;
		
	}
	
	
	public String edit() {

		  this.baseshop = this.serviceInfo.serviceshopcodes(shopcode);
		  return SUCCESS;

		 }
	  public String update(){
		  String shopcode=this.baseshop.getShopcode();
		  this.serviceInfo.servicesaveOrUpdate(baseshop);
		  return SUCCESS;
	  }
	
//根据编号删除信息
   public String delete(){
	   if(this.shopcode!=null){
	   this.serviceInfo.deleteservice(this.shopcode);
	   }
	  return SUCCESS;
	   
	   
	   
   }

	
	
}
