package com.test.restapi.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the UIM_LINK_MODEL database table.
 * 
 */
@Entity
@Table(name="UIM_LINK_MODEL")
@NamedQuery(name="UimLinkModel.findAll", query="SELECT u FROM UimLinkModel u")
public class UimLinkModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="UIM_LINK_OID")
	private Long uimLinkOid;

	@Column(name="REF_SERVICE_NO")
	private String refServiceNo;

	@Column(name="REF_SERVICE_TYPE")
	private String refServiceType;

	@Column(name="ADDTL_WORKGROUP")
	private String addtlWorkgroup;

	@Column(name="BW_2N")
	private String bw2n;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_T")
	private Date createdT;

	@Column(name="CUST_IP")
	private String custIp;

	@Column(name="DEPLOYMENT_METHOD")
	private String deploymentMethod;

	@Column(name="DESCR")
	private String descr;

	@Column(name="DIV_IND")
	private String divInd;

	@Column(name="DIV_REF_NO")
	private String divRefNo;

	@Column(name="DIV_REF_TYPE")
	private String divRefType;

	@Column(name="DIV_TYPE")
	private String divType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="EFF_T")
	private Date effT;

	@Column(name="FIBRE_DROP_IND")
	private String fibreDropInd;

	@Column(name="FIBRE_DROP_IND_FS")
	private String fibreDropIndFs;

	@Column(name="FLOOR_NUM")
	private String floorNum;

	@Column(name="FSA_NO")
	private String fsaNo;

	@Column(name="FTTD_IND")
	private String fttdInd;

	@Column(name="LAST_DRAGON_ORD_NO")
	private String lastDragonOrdNo;

	@Column(name="LAST_L1_ORD_NO")
	private String lastL1OrdNo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MOD_T")
	private Date modT;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Column(name="NAME")
	private String name;

	@Column(name="ONT_POWER_LEVEL")
	private String ontPowerLevel;

	@Column(name="PLATFORM_IND")
	private String platformInd;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="REAL_DATE")
	private Date realDate;

	@Column(name="REAL_ID")
	private String realId;

	@Column(name="SCENARIO")
	private String scenario;

	@Column(name="SERVICE_NO_PREFIX")
	private String serviceNoPrefix;

	@Column(name="SRVBDRY_NUM")
	private String srvbdryNum;

	@Column(name="STATUS")
	private String status;

	@Column(name="SUBLOCAL_INFO")
	private String sublocalInfo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TERM_T")
	private Date termT;

	@Column(name="UIM_LINK_OTYPE")
	private String uimLinkOtype;

	@Column(name="UNIT_NUM")
	private String unitNum;

	@Column(name="VCI")
	private String vci;

	@Column(name="VENDOR_IND")
	private String vendorInd;

	@Column(name="VERSION")
	private Long version;

	@Column(name="VPI")
	private String vpi;

	public UimLinkModel() {
	}

	public String getAddtlWorkgroup() {
		return this.addtlWorkgroup;
	}

	public void setAddtlWorkgroup(String addtlWorkgroup) {
		this.addtlWorkgroup = addtlWorkgroup;
	}

	public String getBw2n() {
		return this.bw2n;
	}

	public void setBw2n(String bw2n) {
		this.bw2n = bw2n;
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

	public String getCustIp() {
		return this.custIp;
	}

	public void setCustIp(String custIp) {
		this.custIp = custIp;
	}

	public String getDeploymentMethod() {
		return this.deploymentMethod;
	}

	public void setDeploymentMethod(String deploymentMethod) {
		this.deploymentMethod = deploymentMethod;
	}

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getDivInd() {
		return this.divInd;
	}

	public void setDivInd(String divInd) {
		this.divInd = divInd;
	}

	public String getDivRefNo() {
		return this.divRefNo;
	}

	public void setDivRefNo(String divRefNo) {
		this.divRefNo = divRefNo;
	}

	public String getDivRefType() {
		return this.divRefType;
	}

	public void setDivRefType(String divRefType) {
		this.divRefType = divRefType;
	}

	public String getDivType() {
		return this.divType;
	}

	public void setDivType(String divType) {
		this.divType = divType;
	}

	public Date getEffT() {
		return this.effT;
	}

	public void setEffT(Date effT) {
		this.effT = effT;
	}

	public String getFibreDropInd() {
		return this.fibreDropInd;
	}

	public void setFibreDropInd(String fibreDropInd) {
		this.fibreDropInd = fibreDropInd;
	}

	public String getFibreDropIndFs() {
		return this.fibreDropIndFs;
	}

	public void setFibreDropIndFs(String fibreDropIndFs) {
		this.fibreDropIndFs = fibreDropIndFs;
	}

	public String getFloorNum() {
		return this.floorNum;
	}

	public void setFloorNum(String floorNum) {
		this.floorNum = floorNum;
	}

	public String getFsaNo() {
		return this.fsaNo;
	}

	public void setFsaNo(String fsaNo) {
		this.fsaNo = fsaNo;
	}

	public String getFttdInd() {
		return this.fttdInd;
	}

	public void setFttdInd(String fttdInd) {
		this.fttdInd = fttdInd;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOntPowerLevel() {
		return this.ontPowerLevel;
	}

	public void setOntPowerLevel(String ontPowerLevel) {
		this.ontPowerLevel = ontPowerLevel;
	}

	public String getPlatformInd() {
		return this.platformInd;
	}

	public void setPlatformInd(String platformInd) {
		this.platformInd = platformInd;
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

	public String getRefServiceNo() {
		return this.refServiceNo;
	}

	public void setRefServiceNo(String refServiceNo) {
		this.refServiceNo = refServiceNo;
	}

	public String getRefServiceType() {
		return this.refServiceType;
	}

	public void setRefServiceType(String refServiceType) {
		this.refServiceType = refServiceType;
	}

	public String getScenario() {
		return this.scenario;
	}

	public void setScenario(String scenario) {
		this.scenario = scenario;
	}

	public String getServiceNoPrefix() {
		return this.serviceNoPrefix;
	}

	public void setServiceNoPrefix(String serviceNoPrefix) {
		this.serviceNoPrefix = serviceNoPrefix;
	}

	public String getSrvbdryNum() {
		return this.srvbdryNum;
	}

	public void setSrvbdryNum(String srvbdryNum) {
		this.srvbdryNum = srvbdryNum;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSublocalInfo() {
		return this.sublocalInfo;
	}

	public void setSublocalInfo(String sublocalInfo) {
		this.sublocalInfo = sublocalInfo;
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

	public String getUimLinkOtype() {
		return this.uimLinkOtype;
	}

	public void setUimLinkOtype(String uimLinkOtype) {
		this.uimLinkOtype = uimLinkOtype;
	}

	public String getUnitNum() {
		return this.unitNum;
	}

	public void setUnitNum(String unitNum) {
		this.unitNum = unitNum;
	}

	public String getVci() {
		return this.vci;
	}

	public void setVci(String vci) {
		this.vci = vci;
	}

	public String getVendorInd() {
		return this.vendorInd;
	}

	public void setVendorInd(String vendorInd) {
		this.vendorInd = vendorInd;
	}

	public Long getVersion() {
		return this.version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public String getVpi() {
		return this.vpi;
	}

	public void setVpi(String vpi) {
		this.vpi = vpi;
	}
}