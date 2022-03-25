package com.test.restapi.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the test_card_table database table.
 * 
 */
@Entity
@Table(name="test_card_table")
@NamedQuery(name="TestCardTable.findAll", query="SELECT t FROM TestCardTable t")
public class TestCardTable implements Serializable {
    private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "card_table_gen")
    @TableGenerator(name = "card_table_gen", table = "test_card_seq", pkColumnName = "card_table_seq", valueColumnName = "card_oid_value", initialValue = 1, allocationSize = 1) 
	@Column(name="UIM_CARD_OID")
	private int uimCardOid;

	@Column(name="CARD_TYPE")
	private String cardType;

	@Column(name="DESCR")
	private String descr;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MOD_T")
	private Date modT;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Column(name="NAME")
	private String name;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="REAL_DATE")
	private Date realDate;

	@Column(name="REAL_ID")
	private String realId;

	@Column(name="STATUS")
	private String status;

	@Column(name="UIM_CARD_OTYPE")
	private String uimCardOtype;

	public TestCardTable() {
	}

	public int getUimCardOid() {
		return this.uimCardOid;
	}

	public void setUimCardOid(int uimCardOid) {
		this.uimCardOid = uimCardOid;
	}

	public String getCardType() {
		return this.cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public Date getModT() {
		return this.modT;
	}

	public void setModT(Date modT) {
		this.modT = modT;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getRealDate() {
		return this.realDate;
	}

	public void setRealDate(Date realDate) {
		this.realDate = realDate;
	}

	public String getRealId() {
		return this.realId;
	}

	public void setRealId(String realId) {
		this.realId = realId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUimCardOtype() {
		return this.uimCardOtype;
	}

	public void setUimCardOtype(String uimCardOtype) {
		this.uimCardOtype = uimCardOtype;
	}
}
