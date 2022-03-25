package com.test.restapi.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the UIM_PHYCONN_MODEL database table.
 * 
 */
@Entity
@Table(name="UIM_PHYCONN_MODEL")
@NamedQuery(name="UimPhyconnModel.findAll", query="SELECT u FROM UimPhyconnModel u")
public class UimPhyconnModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CATEGORY")
	private String category;

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

	@Column(name="NATURE")
	private String nature;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="REAL_DATE")
	private Date realDate;

	@Column(name="REAL_ID")
	private String realId;

	@Column(name="SRC_CARD_OID")
	private Long srcCardOid;

	@Column(name="SRC_CARD_OTYPE")
	private String srcCardOtype;

	@Column(name="SRC_OBJ_OID")
	private Long srcObjOid;

	@Column(name="SRC_OBJ_TYPE")
	private String srcObjType;

	@Column(name="STATUS")
	private String status;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TERM_T")
	private Date termT;

	@Column(name="TGT_CARD_OID")
	private Long tgtCardOid;

	@Column(name="TGT_CARD_OTYPE")
	private String tgtCardOtype;

	@Column(name="TGT_OBJ_OID")
	private Long tgtObjOid;

	@Column(name="TGT_OBJ_TYPE")
	private String tgtObjType;
	
	@Id
	@Column(name="UIM_PHYCONN_OID")
	private Long uimPhyconnOid;

	@Column(name="UIM_PHYCONN_OTYPE")
	private String uimPhyconnOtype;

	@Column(name="VERSION")
	private Long version;

	public UimPhyconnModel() {
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
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

	public String getNature() {
		return this.nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
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

	public Long getSrcCardOid() {
		return this.srcCardOid;
	}

	public void setSrcCardOid(Long srcCardOid) {
		this.srcCardOid = srcCardOid;
	}

	public String getSrcCardOtype() {
		return this.srcCardOtype;
	}

	public void setSrcCardOtype(String srcCardOtype) {
		this.srcCardOtype = srcCardOtype;
	}

	public Long getSrcObjOid() {
		return this.srcObjOid;
	}

	public void setSrcObjOid(Long srcObjOid) {
		this.srcObjOid = srcObjOid;
	}

	public String getSrcObjType() {
		return this.srcObjType;
	}

	public void setSrcObjType(String srcObjType) {
		this.srcObjType = srcObjType;
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

	public Long getTgtCardOid() {
		return this.tgtCardOid;
	}

	public void setTgtCardOid(Long tgtCardOid) {
		this.tgtCardOid = tgtCardOid;
	}

	public String getTgtCardOtype() {
		return this.tgtCardOtype;
	}

	public void setTgtCardOtype(String tgtCardOtype) {
		this.tgtCardOtype = tgtCardOtype;
	}

	public Long getTgtObjOid() {
		return this.tgtObjOid;
	}

	public void setTgtObjOid(Long tgtObjOid) {
		this.tgtObjOid = tgtObjOid;
	}

	public String getTgtObjType() {
		return this.tgtObjType;
	}

	public void setTgtObjType(String tgtObjType) {
		this.tgtObjType = tgtObjType;
	}

	public Long getUimPhyconnOid() {
		return this.uimPhyconnOid;
	}

	public void setUimPhyconnOid(Long uimPhyconnOid) {
		this.uimPhyconnOid = uimPhyconnOid;
	}

	public String getUimPhyconnOtype() {
		return this.uimPhyconnOtype;
	}

	public void setUimPhyconnOtype(String uimPhyconnOtype) {
		this.uimPhyconnOtype = uimPhyconnOtype;
	}

	public Long getVersion() {
		return this.version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

}