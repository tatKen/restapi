package com.test.restapi.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the UIM_CARD_MODEL database table.
 * 
 */
@Entity
@Table(name="UIM_CARD_MODEL")
@NamedQuery(name="UimCardModel.findAll", query="SELECT u FROM UimCardModel u")
public class UimCardModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="UIM_CARD_OID")
	private Long uimCardOid;

	@Column(name="UIM_CARD_OTYPE")
	private String uimCardOtype;

	@Column(name="VERSION")
	private Long version;

	@Column(name="CARD_CATEGORY")
	private String cardCategory;

	@Column(name="CARD_PRIORITY")
	private Long cardPriority;

	@Column(name="CARD_TYPE")
	private String cardType;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_T")
	private Date createdT;

	@Column(name="DESCR")
	private String descr;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="EFF_T")
	private Date effT;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_SYNC_DATE")
	private Date lastSyncDate;

	@Column(name="LAST_SYNC_ID")
	private Long lastSyncId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MOD_T")
	private Date modT;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Column(name="NAME")
	private String name;

	@Column(name="NETWORK_ID")
	private String networkId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="REAL_DATE")
	private Date realDate;

	@Column(name="REAL_ID")
	private String realId;

	@Column(name="SPARE_PORT_CNT")
	private Long sparePortCnt;

	@Column(name="STATUS")
	private String status;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TERM_T")
	private Date termT;

	public UimCardModel() {
	}

	public String getCardCategory() {
		return this.cardCategory;
	}

	public void setCardCategory(String cardCategory) {
		this.cardCategory = cardCategory;
	}

	public Long getCardPriority() {
		return this.cardPriority;
	}

	public void setCardPriority(Long cardPriority) {
		this.cardPriority = cardPriority;
	}

	public String getCardType() {
		return this.cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
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

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public Date getEffT() {
		return this.effT;
	}

	public void setEffT(Date effT) {
		this.effT = effT;
	}

	public Date getLastSyncDate() {
		return this.lastSyncDate;
	}

	public void setLastSyncDate(Date lastSyncDate) {
		this.lastSyncDate = lastSyncDate;
	}

	public Long getLastSyncId() {
		return this.lastSyncId;
	}

	public void setLastSyncId(Long lastSyncId) {
		this.lastSyncId = lastSyncId;
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

	public String getNetworkId() {
		return this.networkId;
	}

	public void setNetworkId(String networkId) {
		this.networkId = networkId;
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

	public Long getSparePortCnt() {
		return this.sparePortCnt;
	}

	public void setSparePortCnt(Long sparePortCnt) {
		this.sparePortCnt = sparePortCnt;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getTermT() {
		return this.termT;
	}

	public void setTermT(Date termT) {
		this.termT = termT;
	}

	public Long getUimCardOid() {
		return this.uimCardOid;
	}

	public void setUimCardOid(Long uimCardOid) {
		this.uimCardOid = uimCardOid;
	}

	public String getUimCardOtype() {
		return this.uimCardOtype;
	}

	public void setUimCardOtype(String uimCardOtype) {
		this.uimCardOtype = uimCardOtype;
	}

	public Long getVersion() {
		return this.version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "UimCardModel{" +
				"uimCardOid=" + uimCardOid +
				", uimCardOtype='" + uimCardOtype + '\'' +
				", version=" + version +
				", cardCategory='" + cardCategory + '\'' +
				", cardPriority=" + cardPriority +
				", cardType='" + cardType + '\'' +
				", createdBy='" + createdBy + '\'' +
				", createdT=" + createdT +
				", descr='" + descr + '\'' +
				", effT=" + effT +
				", lastSyncDate=" + lastSyncDate +
				", lastSyncId=" + lastSyncId +
				", modT=" + modT +
				", modifiedBy='" + modifiedBy + '\'' +
				", name='" + name + '\'' +
				", networkId='" + networkId + '\'' +
				", realDate=" + realDate +
				", realId='" + realId + '\'' +
				", sparePortCnt=" + sparePortCnt +
				", status='" + status + '\'' +
				", termT=" + termT +
				'}';
	}
}