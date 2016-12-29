package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Baseshop entity. @author MyEclipse Persistence Tools
 */

public class Baseshop implements java.io.Serializable {

	// Fields

	private String shopcode;
	private String shopname;
	private Set stocks = new HashSet(0);
	private Set sells = new HashSet(0);

	// Constructors

	/** default constructor */
	public Baseshop() {
	}

	/** minimal constructor */
	public Baseshop(String shopcode, String shopname) {
		this.shopcode = shopcode;
		this.shopname = shopname;
	}

	/** full constructor */
	public Baseshop(String shopcode, String shopname, Set stocks, Set sells) {
		this.shopcode = shopcode;
		this.shopname = shopname;
		this.stocks = stocks;
		this.sells = sells;
	}

	// Property accessors

	public String getShopcode() {
		return this.shopcode;
	}

	public void setShopcode(String shopcode) {
		this.shopcode = shopcode;
	}

	public String getShopname() {
		return this.shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public Set getStocks() {
		return this.stocks;
	}

	public void setStocks(Set stocks) {
		this.stocks = stocks;
	}

	public Set getSells() {
		return this.sells;
	}

	public void setSells(Set sells) {
		this.sells = sells;
	}

}