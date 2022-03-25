package com.test.restapi.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the UIM_PORT_MODEL database table.
 * 
 */
@Entity
@Table(name="UIM_PORT_MODEL")
@NamedQuery(name="UimPortModel.findAll", query="SELECT u FROM UimPortModel u")
public class UimPortModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ALT_STAFF_NO")
	private String altStaffNo;

	@Column(name="CIRCUIT_NO")
	private String circuitNo;

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
	@Column(name="EXPECTED_SRD")
	private Date expectedSrd;

	@Column(name="HEAD")
	private String head;

	@Column(name="INITIATOR_STAFF_NO")
	private String initiatorStaffNo;

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

	@Column(name="OPR_REF_NO")
	private String oprRefNo;

	@Column(name="PROJECT_CODE")
	private String projectCode;

	@Column(name="PROJECT_DESC")
	private String projectDesc;

	@Column(name="PROJECT_REF")
	private String projectRef;

	@Column(name="PROJECT_TYPE")
	private String projectType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="RD")
	private Date rd;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="REAL_DATE")
	private Date realDate;

	@Column(name="REAL_ID")
	private String realId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="RELEASE_DATE")
	private Date releaseDate;

	@Column(name="REQ_BY_DEP")
	private String reqByDep;

	@Column(name="RESERVE_SYSTEM")
	private String reserveSystem;

	@Column(name="RESERVED_ACCT_TYPE")
	private String reservedAcctType;

	@Column(name="RESERVED_BANDWIDTH")
	private Long reservedBandwidth;

	@Column(name="RESERVED_BW_ASSURANCE_TYPE")
	private String reservedBwAssuranceType;

	@Column(name="RESERVED_BW_B")
	private Long reservedBwB;

	@Column(name="RESERVED_BW_P")
	private Long reservedBwP;

	@Column(name="RESERVED_BW_S")
	private Long reservedBwS;

	@Column(name="RESERVED_BW_V")
	private Long reservedBwV;

	@Column(name="RESERVED_LINK_OID")
	private Long reservedLinkOid;

	@Column(name="RESERVED_ORDER_OID")
	private Long reservedOrderOid;

	@Column(name="STATUS")
	private String status;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="STATUS_DATE")
	private Date statusDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TERM_T")
	private Date termT;

	@Column(name="UIM_CARD_OID")
	private Long uimCardOid;

	@Column(name="UIM_CARD_OTYPE")
	private String uimCardOtype;

	@Id
	@Column(name="UIM_PORT_OID")
	private Long uimPortOid;

	@Column(name="UIM_PORT_OTYPE")
	private String uimPortOtype;

	@Column(name="VERSION")
	private Long version;

	public UimPortModel() {
	}

	public String getAltStaffNo() {
		return this.altStaffNo;
	}

	public void setAltStaffNo(String altStaffNo) {
		this.altStaffNo = altStaffNo;
	}

	public String getCircuitNo() {
		return this.circuitNo;
	}

	public void setCircuitNo(String circuitNo) {
		this.circuitNo = circuitNo;
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

	public Date getExpectedSrd() {
		return this.expectedSrd;
	}

	public void setExpectedSrd(Date expectedSrd) {
		this.expectedSrd = expectedSrd;
	}

	public String getHead() {
		return this.head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getInitiatorStaffNo() {
		return this.initiatorStaffNo;
	}

	public void setInitiatorStaffNo(String initiatorStaffNo) {
		this.initiatorStaffNo = initiatorStaffNo;
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

	public String getOprRefNo() {
		return this.oprRefNo;
	}

	public void setOprRefNo(String oprRefNo) {
		this.oprRefNo = oprRefNo;
	}

	public String getProjectCode() {
		return this.projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getProjectDesc() {
		return this.projectDesc;
	}

	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}

	public String getProjectRef() {
		return this.projectRef;
	}

	public void setProjectRef(String projectRef) {
		this.projectRef = projectRef;
	}

	public String getProjectType() {
		return this.projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}

	public Date getRd() {
		return this.rd;
	}

	public void setRd(Date rd) {
		this.rd = rd;
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

	public String getReqByDep() {
		return this.reqByDep;
	}

	public void setReqByDep(String reqByDep) {
		this.reqByDep = reqByDep;
	}

	public String getReserveSystem() {
		return this.reserveSystem;
	}

	public void setReserveSystem(String reserveSystem) {
		this.reserveSystem = reserveSystem;
	}

	public String getReservedAcctType() {
		return this.reservedAcctType;
	}

	public void setReservedAcctType(String reservedAcctType) {
		this.reservedAcctType = reservedAcctType;
	}

	public Long getReservedBandwidth() {
		return this.reservedBandwidth;
	}

	public void setReservedBandwidth(Long reservedBandwidth) {
		this.reservedBandwidth = reservedBandwidth;
	}

	public String getReservedBwAssuranceType() {
		return this.reservedBwAssuranceType;
	}

	public void setReservedBwAssuranceType(String reservedBwAssuranceType) {
		this.reservedBwAssuranceType = reservedBwAssuranceType;
	}

	public Long getReservedBwB() {
		return this.reservedBwB;
	}

	public void setReservedBwB(Long reservedBwB) {
		this.reservedBwB = reservedBwB;
	}

	public Long getReservedBwP() {
		return this.reservedBwP;
	}

	public void setReservedBwP(Long reservedBwP) {
		this.reservedBwP = reservedBwP;
	}

	public Long getReservedBwS() {
		return this.reservedBwS;
	}

	public void setReservedBwS(Long reservedBwS) {
		this.reservedBwS = reservedBwS;
	}

	public Long getReservedBwV() {
		return this.reservedBwV;
	}

	public void setReservedBwV(Long reservedBwV) {
		this.reservedBwV = reservedBwV;
	}

	public Long getReservedLinkOid() {
		return this.reservedLinkOid;
	}

	public void setReservedLinkOid(Long reservedLinkOid) {
		this.reservedLinkOid = reservedLinkOid;
	}

	public Long getReservedOrderOid() {
		return this.reservedOrderOid;
	}

	public void setReservedOrderOid(Long reservedOrderOid) {
		this.reservedOrderOid = reservedOrderOid;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getStatusDate() {
		return this.statusDate;
	}

	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
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

	public Long getUimPortOid() {
		return this.uimPortOid;
	}

	public void setUimPortOid(Long uimPortOid) {
		this.uimPortOid = uimPortOid;
	}

	public String getUimPortOtype() {
		return this.uimPortOtype;
	}

	public void setUimPortOtype(String uimPortOtype) {
		this.uimPortOtype = uimPortOtype;
	}

	public Long getVersion() {
		return this.version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

}