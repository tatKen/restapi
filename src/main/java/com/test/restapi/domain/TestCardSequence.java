package com.test.restapi.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import java.util.Date;


/**
 * The persistent class for the test_card_sequence database table.
 * 
 */
@Entity
@Table(name="test_card_sequence")
@NamedQuery(name="TestCardSequence.findAll", query="SELECT t FROM TestCardSequence t")
public class TestCardSequence implements Serializable {
	private static final long serialVersionUID = 1L;	

	@Id
	@Column(name="UIM_CARD_OID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "card-oid-sequence")
	@GenericGenerator(name = "card-oid-sequence", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", 
						parameters = {
							@Parameter(name = "sequence_name", value = "card_oid_sequence"), 
							@Parameter(name = "initial_value", value = "1"), 
							@Parameter(name = "increment_size", value = "1") 
						})
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

	public TestCardSequence() {
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