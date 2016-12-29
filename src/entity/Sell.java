package entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Sell entity. @author MyEclipse Persistence Tools
 */

public class Sell implements java.io.Serializable {

	// Fields

	private String sellbillcode;
	private Baseshop baseshop;
	private Date sellbilldate;
	private String memo;
	private BigDecimal sellnum;

	// Constructors

	/** default constructor */
	public Sell() {
	}

	/** minimal constructor */
	public Sell(String sellbillcode, Date sellbilldate, BigDecimal sellnum) {
		this.sellbillcode = sellbillcode;
		this.sellbilldate = sellbilldate;
		this.sellnum = sellnum;
	}

	/** full constructor */
	public Sell(String sellbillcode, Baseshop baseshop, Date sellbilldate,
			String memo, BigDecimal sellnum) {
		this.sellbillcode = sellbillcode;
		this.baseshop = baseshop;
		this.sellbilldate = sellbilldate;
		this.memo = memo;
		this.sellnum = sellnum;
	}

	// Property accessors

	public String getSellbillcode() {
		return this.sellbillcode;
	}

	public void setSellbillcode(String sellbillcode) {
		this.sellbillcode = sellbillcode;
	}

	public Baseshop getBaseshop() {
		return this.baseshop;
	}

	public void setBaseshop(Baseshop baseshop) {
		this.baseshop = baseshop;
	}

	public Date getSellbilldate() {
		return this.sellbilldate;
	}

	public void setSellbilldate(Date sellbilldate) {
		this.sellbilldate = sellbilldate;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public BigDecimal getSellnum() {
		return this.sellnum;
	}

	public void setSellnum(BigDecimal sellnum) {
		this.sellnum = sellnum;
	}

}