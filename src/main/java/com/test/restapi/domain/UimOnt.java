package com.test.restapi.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the UIM_ONT database table.
 * 
 */
@Entity
@Table(name="UIM_ONT")
@NamedQuery(name="UimOnt.findAll", query="SELECT u FROM UimOnt u")
public class UimOnt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_T")
	private Date createdT;

	@Column(name="EXCHANGE_ID")
	private String exchangeId;

	@Column(name="INTERFACE_NO")
	private String interfaceNo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_ASSIGNED_DATE")
	private Date lastAssignedDate;

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

	@Id
	@Column(name="NID")
	private String nid;

	@Column(name="NIDEN")
	private String niden;

	@Column(name="OLT_ID")
	private String oltId;

	@Column(name="ONT_ID")
	private String ontId;

	@Column(name="ONT_OID")
	private Long ontOid;

	@Column(name="PROJECT_CODE")
	private String projectCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="REAL_DATE")
	private Date realDate;

	@Column(name="REAL_ID")
	private String realId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="RELEASE_DATE")
	private Date releaseDate;

	@Column(name="RESERVE_SYSTEM")
	private String reserveSystem;

	@Column(name="RTPORT")
	private String rtport;

	@Column(name="SLOT_ID")
	private String slotId;

	@Column(name="STATUS")
	private String status;

	@Column(name="VERSION")
	private Long version;

	public UimOnt() {
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

	public String getExchangeId() {
		return this.exchangeId;
	}

	public void setExchangeId(String exchangeId) {
		this.exchangeId = exchangeId;
	}

	public String getInterfaceNo() {
		return this.interfaceNo;
	}

	public void setInterfaceNo(String interfaceNo) {
		this.interfaceNo = interfaceNo;
	}

	public Date getLastAssignedDate() {
		return this.lastAssignedDate;
	}

	public void setLastAssignedDate(Date lastAssignedDate) {
		this.lastAssignedDate = lastAssignedDate;
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

	public String getNid() {
		return this.nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
	}

	public String getNiden() {
		return this.niden;
	}

	public void setNiden(String niden) {
		this.niden = niden;
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

	public Long getOntOid() {
		return this.ontOid;
	}

	public void setOntOid(Long ontOid) {
		this.ontOid = ontOid;
	}

	public String getProjectCode() {
		return this.projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
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

	public Date getReleaseDate() {
		return this.releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getReserveSystem() {
		return this.reserveSystem;
	}

	public void setReserveSystem(String reserveSystem) {
		this.reserveSystem = reserveSystem;
	}

	public String getRtport() {
		return this.rtport;
	}

	public void setRtport(String rtport) {
		this.rtport = rtport;
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

	public Long getVersion() {
		return this.version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

}