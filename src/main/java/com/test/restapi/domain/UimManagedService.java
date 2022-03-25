package com.test.restapi.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the UIM_MANAGED_SERVICE database table.
 * 
 */
@Entity
@Table(name="UIM_MANAGED_SERVICE")
@NamedQuery(name="UimManagedService.findAll", query="SELECT u FROM UimManagedService u")
public class UimManagedService implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="STBTYPE")
	private String stbtype;

	@Id
	@Column(name="L1PID")
	private String l1pid;

	@Column(name="ACCT_TYPE")
	private String acctType;

	@Column(name="BANDWIDTH")
	private Long bandwidth;

	@Column(name="BR_NO")
	private String brNo;

	@Column(name="BW_ASSURANCE_TYPE")
	private String bwAssuranceType;

	@Column(name="BW_B")
	private Long bwB;

	@Column(name="BW_P")
	private Long bwP;

	@Column(name="BW_S")
	private Long bwS;

	@Column(name="BW_V")
	private Long bwV;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_T")
	private Date createdT;

	@Column(name="CUSTOMER_NAME")
	private String customerName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="EFF_T")
	private Date effT;

	@Column(name="LAST_DRAGON_ORD_NO")
	private String lastDragonOrdNo;

	@Column(name="LAST_L1_ORD_NO")
	private String lastL1OrdNo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MOD_T")
	private Date modT;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Column(name="PRODGRP")
	private String prodgrp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="REAL_DATE")
	private Date realDate;

	@Column(name="REAL_ID")
	private String realId;

	@Column(name="SERVICE_NO")
	private String serviceNo;

	@Column(name="SERVICE_TYPE")
	private String serviceType;

	@Column(name="STATUS")
	private String status;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TERM_T")
	private Date termT;

	@Column(name="VERSION")
	private Long version;

	public UimManagedService() {
	}

	public String getAcctType() {
		return this.acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	public Long getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Long bandwidth) {
		this.bandwidth = bandwidth;
	}

	public String getBrNo() {
		return this.brNo;
	}

	public void setBrNo(String brNo) {
		this.brNo = brNo;
	}

	public String getBwAssuranceType() {
		return this.bwAssuranceType;
	}

	public void setBwAssuranceType(String bwAssuranceType) {
		this.bwAssuranceType = bwAssuranceType;
	}

	public Long getBwB() {
		return this.bwB;
	}

	public void setBwB(Long bwB) {
		this.bwB = bwB;
	}

	public Long getBwP() {
		return this.bwP;
	}

	public void setBwP(Long bwP) {
		this.bwP = bwP;
	}

	public Long getBwS() {
		return this.bwS;
	}

	public void setBwS(Long bwS) {
		this.bwS = bwS;
	}

	public Long getBwV() {
		return this.bwV;
	}

	public void setBwV(Long bwV) {
		this.bwV = bwV;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedT() {
		return this.createdT;
	}

	public void setCreatedT(Date createdT) {
		this.createdT = createdT;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getEffT() {
		return this.effT;
	}

	public void setEffT(Date effT) {
		this.effT = effT;
	}

	public String getL1pid() {
		return this.l1pid;
	}

	public void setL1pid(String l1pid) {
		this.l1pid = l1pid;
	}

	public String getLastDragonOrdNo() {
		return this.lastDragonOrdNo;
	}

	public void setLastDragonOrdNo(String lastDragonOrdNo) {
		this.lastDragonOrdNo = lastDragonOrdNo;
	}

	public String getLastL1OrdNo() {
		return this.lastL1OrdNo;
	}

	public void setLastL1OrdNo(String lastL1OrdNo) {
		this.lastL1OrdNo = lastL1OrdNo;
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

	public String getProdgrp() {
		return this.prodgrp;
	}

	public void setProdgrp(String prodgrp) {
		this.prodgrp = prodgrp;
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

	public String getServiceNo() {
		return this.serviceNo;
	}

	public void setServiceNo(String serviceNo) {
		this.serviceNo = serviceNo;
	}

	public String getServiceType() {
		return this.serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStbtype() {
		return this.stbtype;
	}

	public void setStbtype(String stbtype) {
		this.stbtype = stbtype;
	}

	public Date getTermT() {
		return this.termT;
	}

	public void setTermT(Date termT) {
		this.termT = termT;
	}

	public Long getVersion() {
		return this.version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

}