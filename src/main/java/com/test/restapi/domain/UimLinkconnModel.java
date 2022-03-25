package com.test.restapi.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the UIM_LINKCONN_MODEL database table.
 * 
 */
@Entity
@Table(name="UIM_LINKCONN_MODEL")
@NamedQuery(name="UimLinkconnModel.findAll", query="SELECT u FROM UimLinkconnModel u")
public class UimLinkconnModel implements Serializable {
	private static final long serialVersionUID = 1L;

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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TERM_T")
	private Date termT;

	@Column(name="UIM_LINK_OID")
	private Long uimLinkOid;

	@Id
	@Column(name="UIM_LINKCONN_OID")
	private Long uimLinkconnOid;

	@Column(name="UIM_LINKCONN_OTYPE")
	private String uimLinkconnOtype;

	@Column(name="UIM_PHYCONN_OID")
	private Long uimPhyconnOid;

	@Column(name="VERSION")
	private Long version;

	public UimLinkconnModel() {
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

	public Date getTermT() {
		return this.termT;
	}

	public void setTermT(Date termT) {
		this.termT = termT;
	}

	public Long getUimLinkOid() {
		return this.uimLinkOid;
	}

	public void setUimLinkOid(Long uimLinkOid) {
		this.uimLinkOid = uimLinkOid;
	}

	public Long getUimLinkconnOid() {
		return this.uimLinkconnOid;
	}

	public void setUimLinkconnOid(Long uimLinkconnOid) {
		this.uimLinkconnOid = uimLinkconnOid;
	}

	public String getUimLinkconnOtype() {
		return this.uimLinkconnOtype;
	}

	public void setUimLinkconnOtype(String uimLinkconnOtype) {
		this.uimLinkconnOtype = uimLinkconnOtype;
	}

	public Long getUimPhyconnOid() {
		return this.uimPhyconnOid;
	}

	public void setUimPhyconnOid(Long uimPhyconnOid) {
		this.uimPhyconnOid = uimPhyconnOid;
	}

	public Long getVersion() {
		return this.version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

}