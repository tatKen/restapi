package com.test.restapi.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the IMSL1PID database table.
 * 
 */
@Entity
@Table(name="IMSL1PID")
@NamedQuery(name="Imsl1pid.findAll", query="SELECT i FROM Imsl1pid i")
public class Imsl1pid implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PID")
	private String pid;

	@Id
	@Column(name="STB")
	private String stb;

	@OneToMany(mappedBy = "toImsl1pid")
	Set<UimOrderModel> toOrders;

	@OneToMany(mappedBy = "fromImsL1pid")
	Set<UimOrderModel> frOrders;

	@Column(name="ACCT_SUB_TYPE")
	private String acctSubType;

	@Column(name="BRM_IND")
	private String brmInd;

	@Column(name="BW_ASSURANCE_TYPE")
	private String bwAssuranceType;

	@Column(name="DIVERSITY_IND")
	private String diversityInd;

	@Column(name="DOWN_BW")
	private String downBw;

	@Column(name="DPRVMTHD")
	private String dprvmthd;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="EFFECTIVE_DATE")
	private Date effectiveDate;

	@Column(name="EW_IND")
	private String ewInd;

	@Column(name="EYE_IND")
	private String eyeInd;

	@Column(name="FORCE_FALLOUT_IND")
	private String forceFalloutInd;

	@Column(name="FTTH_IND")
	private String ftthInd;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_UPDATE_DATE")
	private Date lastUpdateDate;

	@Column(name="LAST_UPDATED_BY")
	private String lastUpdatedBy;

	@Column(name="MISC_IND")
	private String miscInd;

	@Column(name="MODIFY_IND")
	private String modifyInd;

	@Column(name="PRDSHTDS")
	private String prdshtds;

	@Column(name="PS3_BRM")
	private String ps3Brm;

	@Column(name="RESILIENCE_IND")
	private String resilienceInd;

	@Column(name="SPARE_MK")
	private String spareMk;

	@Column(name="SYNCH_RATE")
	private String synchRate;

	@Column(name="UP_BW")
	private String upBw;

	@Column(name="VI_BW1")
	private String viBw1;

	@Column(name="VI_BW2")
	private String viBw2;

	public Imsl1pid() {
	}

	public String getAcctSubType() {
		return this.acctSubType;
	}

	public void setAcctSubType(String acctSubType) {
		this.acctSubType = acctSubType;
	}

	public String getBrmInd() {
		return this.brmInd;
	}

	public void setBrmInd(String brmInd) {
		this.brmInd = brmInd;
	}

	public String getBwAssuranceType() {
		return this.bwAssuranceType;
	}

	public void setBwAssuranceType(String bwAssuranceType) {
		this.bwAssuranceType = bwAssuranceType;
	}

	public String getDiversityInd() {
		return this.diversityInd;
	}

	public void setDiversityInd(String diversityInd) {
		this.diversityInd = diversityInd;
	}

	public String getDownBw() {
		return this.downBw;
	}

	public void setDownBw(String downBw) {
		this.downBw = downBw;
	}

	public String getDprvmthd() {
		return this.dprvmthd;
	}

	public void setDprvmthd(String dprvmthd) {
		this.dprvmthd = dprvmthd;
	}

	public Date getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getEwInd() {
		return this.ewInd;
	}

	public void setEwInd(String ewInd) {
		this.ewInd = ewInd;
	}

	public String getEyeInd() {
		return this.eyeInd;
	}

	public void setEyeInd(String eyeInd) {
		this.eyeInd = eyeInd;
	}

	public String getForceFalloutInd() {
		return this.forceFalloutInd;
	}

	public void setForceFalloutInd(String forceFalloutInd) {
		this.forceFalloutInd = forceFalloutInd;
	}

	public String getFtthInd() {
		return this.ftthInd;
	}

	public void setFtthInd(String ftthInd) {
		this.ftthInd = ftthInd;
	}

	public Date getLastUpdateDate() {
		return this.lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getLastUpdatedBy() {
		return this.lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public String getMiscInd() {
		return this.miscInd;
	}

	public void setMiscInd(String miscInd) {
		this.miscInd = miscInd;
	}

	public String getModifyInd() {
		return this.modifyInd;
	}

	public void setModifyInd(String modifyInd) {
		this.modifyInd = modifyInd;
	}

	public String getPid() {
		return this.pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPrdshtds() {
		return this.prdshtds;
	}

	public void setPrdshtds(String prdshtds) {
		this.prdshtds = prdshtds;
	}

	public String getPs3Brm() {
		return this.ps3Brm;
	}

	public void setPs3Brm(String ps3Brm) {
		this.ps3Brm = ps3Brm;
	}

	public String getResilienceInd() {
		return this.resilienceInd;
	}

	public void setResilienceInd(String resilienceInd) {
		this.resilienceInd = resilienceInd;
	}

	public String getSpareMk() {
		return this.spareMk;
	}

	public void setSpareMk(String spareMk) {
		this.spareMk = spareMk;
	}

	public String getStb() {
		return this.stb;
	}

	public void setStb(String stb) {
		this.stb = stb;
	}

	public String getSynchRate() {
		return this.synchRate;
	}

	public void setSynchRate(String synchRate) {
		this.synchRate = synchRate;
	}

	public String getUpBw() {
		return this.upBw;
	}

	public void setUpBw(String upBw) {
		this.upBw = upBw;
	}

	public String getViBw1() {
		return this.viBw1;
	}

	public void setViBw1(String viBw1) {
		this.viBw1 = viBw1;
	}

	public String getViBw2() {
		return this.viBw2;
	}

	public void setViBw2(String viBw2) {
		this.viBw2 = viBw2;
	}

}