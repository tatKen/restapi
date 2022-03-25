package com.test.restapi.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the UIM_SB_SRV_CODE database table.
 * 
 */
@Embeddable
@Table(name="UIM_SB_SRV_CODE")
@NamedQuery(name="UimSbSrvCode.findAll", query="SELECT u FROM UimSbSrvCode u")
public class UimSbSrvCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="REAL_DATE")
	private Date realDate;

	@Column(name="REAL_ID")
	private String realId;

	@Column(name="SB_NO")
	private String sbNo;

	@Column(name="SERVICE_CODE")
	private String serviceCode;

	public UimSbSrvCode() {
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

	public String getSbNo() {
		return this.sbNo;
	}

	public void setSbNo(String sbNo) {
		this.sbNo = sbNo;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

}