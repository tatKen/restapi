package com.test.restapi.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the UIM_LINK_ONT database table.
 * 
 */
@Entity
@Table(name="UIM_LINK_ONT")
@NamedQuery(name="UimLinkOnt.findAll", query="SELECT u FROM UimLinkOnt u")
public class UimLinkOnt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_T")
	private Date createdT;

	@Column(name="INTERFACE_NO")
	private String interfaceNo;

	@Id
	@Column(name="LINKONT_OID")
	private Long linkontOid;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MOD_T")
	private Date modT;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Column(name="OLT_ID")
	private String oltId;

	@Column(name="ONT_ID")
	private String ontId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="REAL_DATE")
	private Date realDate;

	@Column(name="REAL_ID")
	private String realId;

	@Column(name="RT_PORT")
	private String rtPort;

	@Column(name="SLOT_ID")
	private String slotId;

	@Column(name="STATUS")
	private String status;

	@Column(name="UIM_LINK_OID")
	private Long uimLinkOid;

	@Column(name="VERSION")
	private Long version;

	public UimLinkOnt() {
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

	public String getInterfaceNo() {
		return this.interfaceNo;
	}

	public void setInterfaceNo(String interfaceNo) {
		this.interfaceNo = interfaceNo;
	}

	public Long getLinkontOid() {
		return this.linkontOid;
	}

	public void setLinkontOid(Long linkontOid) {
		this.linkontOid = linkontOid;
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

	public String getOltId() {
		return this.oltId;
	}

	public void setOltId(String oltId) {
		this.oltId = oltId;
	}

	public String getOntId() {
		return this.ontId;
	}

	public void setOntId(String ontId) {
		this.ontId = ontId;
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

	public String getRtPort() {
		return this.rtPort;
	}

	public void setRtPort(String rtPort) {
		this.rtPort = rtPort;
	}

	public String getSlotId() {
		return this.slotId;
	}

	public void setSlotId(String slotId) {
		this.slotId = slotId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getUimLinkOid() {
		return this.uimLinkOid;
	}

	public void setUimLinkOid(Long uimLinkOid) {
		this.uimLinkOid = uimLinkOid;
	}

	public Long getVersion() {
		return this.version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

}