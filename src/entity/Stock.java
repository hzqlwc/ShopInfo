package entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Stock entity. @author MyEclipse Persistence Tools
 */

public class Stock implements java.io.Serializable {

	// Fields

	private String stockbillcode;
	private Baseshop baseshop;
	private Date stockbilldate;
	private String memo;
	private BigDecimal stocknum;

	// Constructors

	/** default constructor */
	public Stock() {
	}

	/** minimal constructor */
	public Stock(String stockbillcode, Date stockbilldate, BigDecimal stocknum) {
		this.stockbillcode = stockbillcode;
		this.stockbilldate = stockbilldate;
		this.stocknum = stocknum;
	}

	/** full constructor */
	public Stock(String stockbillcode, Baseshop baseshop, Date stockbilldate,
			String memo, BigDecimal stocknum) {
		this.stockbillcode = stockbillcode;
		this.baseshop = baseshop;
		this.stockbilldate = stockbilldate;
		this.memo = memo;
		this.stocknum = stocknum;
	}

	// Property accessors

	public String getStockbillcode() {
		return this.stockbillcode;
	}

	public void setStockbillcode(String stockbillcode) {
		this.stockbillcode = stockbillcode;
	}

	public Baseshop getBaseshop() {
		return this.baseshop;
	}

	public void setBaseshop(Baseshop baseshop) {
		this.baseshop = baseshop;
	}

	public Date getStockbilldate() {
		return this.stockbilldate;
	}

	public void setStockbilldate(Date stockbilldate) {
		this.stockbilldate = stockbilldate;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public BigDecimal getStocknum() {
		return this.stocknum;
	}

	public void setStocknum(BigDecimal stocknum) {
		this.stocknum = stocknum;
	}

}