package com.test.restapi.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the UIM_SRV_CODE_DTL database table.
 * 
 */
@Entity
@Table(name="UIM_SRV_CODE_DTL")
@NamedQuery(name="UimSrvCodeDtl.findAll", query="SELECT u FROM UimSrvCodeDtl u")
public class UimSrvCodeDtl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BANDWIDTH")
	private BigDecimal bandwidth;

	@Column(name="DISPLAY_SEQ")
	private Long displaySeq;

	@Column(name="HDTV")
	private String hdtv;

	@Column(name="IS_PREMIER")
	private String isPremier;

	@Column(name="IS_RM")
	private String isRm;

	@Column(name="MAX_BB")
	private BigDecimal maxBb;

	@Column(name="MAX_FTTB")
	private BigDecimal maxFttb;

	@Column(name="MAX_FTTH")
	private BigDecimal maxFtth;

	@Column(name="ON_DEMAND_PON")
	private String onDemandPon;

	@Column(name="PON")
	private String pon;

	@Column(name="PREFIX")
	private String prefix;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="REAL_DATE")
	private Date realDate;

	@Column(name="REAL_ID")
	private String realId;

	@Column(name="SDTV")
	private String sdtv;

	@Id
	@Column(name="SERVICE_CODE")
	private String serviceCode;

	@Column(name="SERVICE_DESC")
	private String serviceDesc;

	@Column(name="SHORT_DESC")
	private String shortDesc;

	@Column(name="SHORT_DESC_PRIORITY")
	private Long shortDescPriority;

	@Column(name="SPRINGBOARD_IMS_ACQ")
	private String springboardImsAcq;

	@Column(name="VDSL1")
	private String vdsl1;

	@Column(name="VDSL2")
	private String vdsl2;

	public UimSrvCodeDtl() {
	}

	public BigDecimal getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(BigDecimal bandwidth) {
		this.bandwidth = bandwidth;
	}

	public Long getDisplaySeq() {
		return this.displaySeq;
	}

	public void setDisplaySeq(Long displaySeq) {
		this.displaySeq = displaySeq;
	}

	public String getHdtv() {
		return this.hdtv;
	}

	public void setHdtv(String hdtv) {
		this.hdtv = hdtv;
	}

	public String getIsPremier() {
		return this.isPremier;
	}

	public void setIsPremier(String isPremier) {
		this.isPremier = isPremier;
	}

	public String getIsRm() {
		return this.isRm;
	}

	public void setIsRm(String isRm) {
		this.isRm = isRm;
	}

	public BigDecimal getMaxBb() {
		return this.maxBb;
	}

	public void setMaxBb(BigDecimal maxBb) {
		this.maxBb = maxBb;
	}

	public BigDecimal getMaxFttb() {
		return this.maxFttb;
	}

	public void setMaxFttb(BigDecimal maxFttb) {
		this.maxFttb = maxFttb;
	}

	public BigDecimal getMaxFtth() {
		return this.maxFtth;
	}

	public void setMaxFtth(BigDecimal maxFtth) {
		this.maxFtth = maxFtth;
	}

	public String getOnDemandPon() {
		return this.onDemandPon;
	}

	public void setOnDemandPon(String onDemandPon) {
		this.onDemandPon = onDemandPon;
	}

	public String getPon() {
		return this.pon;
	}

	public void setPon(String pon) {
		this.pon = pon;
	}

	public String getPrefix() {
		return this.prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
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

	public String getSdtv() {
		return this.sdtv;
	}

	public void setSdtv(String sdtv) {
		this.sdtv = sdtv;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getServiceDesc() {
		return this.serviceDesc;
	}

	public void setServiceDesc(String serviceDesc) {
		this.serviceDesc = serviceDesc;
	}

	public String getShortDesc() {
		return this.shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

	public Long getShortDescPriority() {
		return this.shortDescPriority;
	}

	public void setShortDescPriority(Long shortDescPriority) {
		this.shortDescPriority = shortDescPriority;
	}

	public String getSpringboardImsAcq() {
		return this.springboardImsAcq;
	}

	public void setSpringboardImsAcq(String springboardImsAcq) {
		this.springboardImsAcq = springboardImsAcq;
	}

	public String getVdsl1() {
		return this.vdsl1;
	}

	public void setVdsl1(String vdsl1) {
		this.vdsl1 = vdsl1;
	}

	public String getVdsl2() {
		return this.vdsl2;
	}

	public void setVdsl2(String vdsl2) {
		this.vdsl2 = vdsl2;
	}

}