package com.test.restapi.domain;

import javax.persistence.*;

import org.hibernate.annotations.NaturalId;

import java.io.Serializable;
import java.util.Date; 


/**
 * The persistent class for the UIM_ORDER_MODEL database table.
 * 
 */
@Entity
@Table(name="UIM_ORDER_MODEL")
@NamedQuery(name="UimOrderModel.findAll", query="SELECT u FROM UimOrderModel u")
public class UimOrderModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="UIM_ORD_OID")
	private Long uimOrdOid;

	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "to_l1pid", referencedColumnName = "pid"),
		@JoinColumn(name = "to_stbtype", referencedColumnName = "stb")
	})
	private Imsl1pid toImsl1pid;

	@ManyToOne
	@JoinColumns({
			@JoinColumn(name = "fr_l1pid", referencedColumnName = "pid"),
			@JoinColumn(name = "fr_stbtype", referencedColumnName = "stb")
	})
	private Imsl1pid fromImsL1pid; 

	@Column(name="TO_L1PID")
	private String toL1pid;

	@Column(name="TO_STBTYPE")
	private String toStbtype;

	@Column(name="ACCT_MGR")
	private String acctMgr;

	@Column(name="ACCT_TYPE")
	private String acctType;

	@Column(name="ACTION_TYPE")
	private String actionType;

	@Column(name="ADDTL_WORKGROUP")
	private String addtlWorkgroup;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="APPLY_DT")
	private Date applyDt;

	@Column(name="AREA_CD")
	private String areaCd;

	@Column(name="AREANAME")
	private String areaname;

	@Column(name="ASM")
	private String asm;

	@Column(name="ASSIGNED_STAFF_NO")
	private String assignedStaffNo;

	@Column(name="BR_NO")
	private String brNo;

	@Column(name="BUILD_CD")
	private String buildCd;

	@Column(name="BUILD_NAME")
	private String buildName;

	@Column(name="BUILD_SEQ")
	private Long buildSeq;

	@Column(name="BW_2N")
	private String bw2n;

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

	@Column(name="CAN_REISSUE_BSN")
	private String canReissueBsn;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_T")
	private Date createdT;

	@Column(name="CUST_CONTACT_FAX")
	private String custContactFax;

	@Column(name="CUST_CONTACT_NAME")
	private String custContactName;

	@Column(name="CUST_CONTACT_PHONE")
	private String custContactPhone;

	@Column(name="CUSTOMER_NAME")
	private String customerName;

	@Column(name="CXS_ACTIVITY_NO")
	private Long cxsActivityNo;

	@Column(name="CXS_REQUEST_NO")
	private Long cxsRequestNo;

	@Column(name="DEPLOYMENT_METHOD")
	private String deploymentMethod;

	@Column(name="DEPLOYMENT_SCENARIO")
	private String deploymentScenario;

	@Column(name="DESCR")
	private String descr;

	@Column(name="DISTR_NUM")
	private Long distrNum;

	@Column(name="DIV_IND")
	private String divInd;

	@Column(name="DIV_REF_NO")
	private String divRefNo;

	@Column(name="DIV_REF_TYPE")
	private String divRefType;

	@Column(name="DIV_TYPE")
	private String divType;

	@Column(name="DRAGON_ORDER_NO")
	private String dragonOrderNo;

	@Column(name="DRAGON_STATUS")
	private String dragonStatus;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DRAGON_STATUS_MOD_T")
	private Date dragonStatusModT;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="EFF_T")
	private Date effT;

	@Column(name="EXTEND_COVERAGE_RPT_BY")
	private String extendCoverageRptBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="EXTEND_COVERAGE_RPT_DATE")
	private Date extendCoverageRptDate;

	@Column(name="EYE_TYPE")
	private String eyeType;

	@Column(name="FAILED_REASON")
	private String failedReason;

	@Column(name="FALLBACK_IND")
	private String fallbackInd;

	@Column(name="FIBRE_DROP_IND")
	private String fibreDropInd;

	@Column(name="FIBRE_DROP_IND_FS")
	private String fibreDropIndFs;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FIRST_CALL_DATE")
	private Date firstCallDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FIRST_ISS_DATE")
	private Date firstIssDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FIRST_SR_DATE")
	private Date firstSrDate;

	@Column(name="FLOOR_NUM")
	private String floorNum;

	@Column(name="FR_L1PID")
	private String frL1pid;

	@Column(name="FR_NID")
	private String frNid;

	@Column(name="FR_STBTYPE")
	private String frStbtype;

	@Column(name="FSA_NO")
	private String fsaNo;

	@Column(name="FTTD_IND")
	private String fttdInd;

	@Column(name="GON")
	private Long gon;

	@Column(name="HLOT_NUM")
	private String hlotNum;

	@Column(name="ISS_STAFF_ID")
	private String issStaffId;

	@Column(name="L1_ORDER_NO")
	private String l1OrderNo;

	@Column(name="L2_JOB")
	private String l2Job;

	@Column(name="L2_MODEM_CODE")
	private String l2ModemCode;

	@Column(name="L2_MODEM_GRP")
	private String l2ModemGrp;

	@Column(name="L2ORDNUM")
	private String l2ordnum;

	@Column(name="LDLOT_NUM")
	private String ldlotNum;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LEGACY_COMPL_DATE")
	private Date legacyComplDate;

	@Column(name="LOT_HSE_IND")
	private String lotHseInd;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MOD_T")
	private Date modT;

	@Column(name="MODEM_CODE")
	private String modemCode;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Column(name="NAME")
	private String name;

	@Column(name="NEXT_SYSTEM")
	private String nextSystem;

	@Column(name="OC_ID")
	private String ocId;

	@Column(name="ON_DMD_PON_SB")
	private String onDmdPonSb;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ORD_COMPL_DATE")
	private Date ordComplDate;

	@Column(name="ORDSUBTYPE")
	private String ordsubtype;

	@Column(name="PLANNING_TEAM")
	private String planningTeam;

	@Column(name="PLATFORM_IND")
	private String platformInd;

	@Column(name="PRODGRP")
	private String prodgrp;

	@Column(name="PROJ_CODE")
	private String projCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="REAL_DATE")
	private Date realDate;

	@Column(name="REAL_ID")
	private String realId;

	@NaturalId
	@Column(name="REF_SERVICE_NO")
	private String refServiceNo;

	@Column(name="REF_SERVICE_TYPE")
	private String refServiceType;

	@Column(name="REQ_BANDWIDTH")
	private Long reqBandwidth;

	@Column(name="RESOURCE_USED_UP_BY")
	private String resourceUsedUpBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="RESOURCE_USED_UP_DATE")
	private Date resourceUsedUpDate;

	@Column(name="RESOURCE_USED_UP_REASON")
	private String resourceUsedUpReason;

	@Column(name="RESOURCE_USED_UP_REMARK")
	private String resourceUsedUpRemark;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="RESUME_RPT_DATE")
	private Date resumeRptDate;

	@Column(name="SALES_TYPE")
	private String salesType;

	@Column(name="SECT_CD")
	private String sectCd;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="SERV_REQ_DATE")
	private Date servReqDate;

	@Column(name="SERVICE_CD")
	private String serviceCd;

	@Column(name="SERVICE_NO_PREFIX")
	private String serviceNoPrefix;

	@Column(name="SRVBDRY_NUM")
	private String srvbdryNum;

	@Column(name="ST_CATG_CD")
	private String stCatgCd;

	@Column(name="STATUS")
	private String status;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="STATUS_DATE")
	private Date statusDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="STILL_FALLOUT_RPT_DATE")
	private Date stillFalloutRptDate;

	@Column(name="STREET_NAME")
	private String streetName;

	@Column(name="STREET_NUM")
	private String streetNum;

	@Column(name="SYS_MSG")
	private String sysMsg;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TERM_T")
	private Date termT;

	@Column(name="UIM_ORD_OTYPE")
	private String uimOrdOtype;

	@Column(name="UIM_ORD_SUBTYPE")
	private String uimOrdSubtype;

	@Column(name="UIM_ORD_SYS")
	private String uimOrdSys;

	@Column(name="UIM_ORD_TYPE")
	private String uimOrdType;

	@Column(name="UIM_TORD_TYPE")
	private String uimTordType;

	@Column(name="UNIT_NUM")
	private String unitNum;

	@Column(name="USER_NAME")
	private String userName;

	@Column(name="VENDOR_IND")
	private String vendorInd;

	@Column(name="VERSION")
	private Long version;

	@Column(name="WIRING_STATUS")
	private String wiringStatus;

	@Column(name="WIRING_STATUS_UPD_BY")
	private String wiringStatusUpdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="WIRING_STATUS_UPD_DATE")
	private Date wiringStatusUpdDate;

	public UimOrderModel() {
	}

	public String getAcctMgr() {
		return this.acctMgr;
	}

	public void setAcctMgr(String acctMgr) {
		this.acctMgr = acctMgr;
	}

	public String getAcctType() {
		return this.acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	public String getActionType() {
		return this.actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getAddtlWorkgroup() {
		return this.addtlWorkgroup;
	}

	public void setAddtlWorkgroup(String addtlWorkgroup) {
		this.addtlWorkgroup = addtlWorkgroup;
	}

	public Date getApplyDt() {
		return this.applyDt;
	}

	public void setApplyDt(Date applyDt) {
		this.applyDt = applyDt;
	}

	public String getAreaCd() {
		return this.areaCd;
	}

	public void setAreaCd(String areaCd) {
		this.areaCd = areaCd;
	}

	public String getAreaname() {
		return this.areaname;
	}

	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}

	public String getAsm() {
		return this.asm;
	}

	public void setAsm(String asm) {
		this.asm = asm;
	}

	public String getAssignedStaffNo() {
		return this.assignedStaffNo;
	}

	public void setAssignedStaffNo(String assignedStaffNo) {
		this.assignedStaffNo = assignedStaffNo;
	}

	public String getBrNo() {
		return this.brNo;
	}

	public void setBrNo(String brNo) {
		this.brNo = brNo;
	}

	public String getBuildCd() {
		return this.buildCd;
	}

	public void setBuildCd(String buildCd) {
		this.buildCd = buildCd;
	}

	public String getBuildName() {
		return this.buildName;
	}

	public void setBuildName(String buildName) {
		this.buildName = buildName;
	}

	public Long getBuildSeq() {
		return this.buildSeq;
	}

	public void setBuildSeq(Long buildSeq) {
		this.buildSeq = buildSeq;
	}

	public String getBw2n() {
		return this.bw2n;
	}

	public void setBw2n(String bw2n) {
		this.bw2n = bw2n;
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

	public String getCanReissueBsn() {
		return this.canReissueBsn;
	}

	public void setCanReissueBsn(String canReissueBsn) {
		this.canReissueBsn = canReissueBsn;
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

	public String getCustContactFax() {
		return this.custContactFax;
	}

	public void setCustContactFax(String custContactFax) {
		this.custContactFax = custContactFax;
	}

	public String getCustContactName() {
		return this.custContactName;
	}

	public void setCustContactName(String custContactName) {
		this.custContactName = custContactName;
	}

	public String getCustContactPhone() {
		return this.custContactPhone;
	}

	public void setCustContactPhone(String custContactPhone) {
		this.custContactPhone = custContactPhone;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Long getCxsActivityNo() {
		return this.cxsActivityNo;
	}

	public void setCxsActivityNo(Long cxsActivityNo) {
		this.cxsActivityNo = cxsActivityNo;
	}

	public Long getCxsRequestNo() {
		return this.cxsRequestNo;
	}

	public void setCxsRequestNo(Long cxsRequestNo) {
		this.cxsRequestNo = cxsRequestNo;
	}

	public String getDeploymentMethod() {
		return this.deploymentMethod;
	}

	public void setDeploymentMethod(String deploymentMethod) {
		this.deploymentMethod = deploymentMethod;
	}

	public String getDeploymentScenario() {
		return this.deploymentScenario;
	}

	public void setDeploymentScenario(String deploymentScenario) {
		this.deploymentScenario = deploymentScenario;
	}

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public Long getDistrNum() {
		return this.distrNum;
	}

	public void setDistrNum(Long distrNum) {
		this.distrNum = distrNum;
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

	public String getDragonOrderNo() {
		return this.dragonOrderNo;
	}

	public void setDragonOrderNo(String dragonOrderNo) {
		this.dragonOrderNo = dragonOrderNo;
	}

	public String getDragonStatus() {
		return this.dragonStatus;
	}

	public void setDragonStatus(String dragonStatus) {
		this.dragonStatus = dragonStatus;
	}

	public Date getDragonStatusModT() {
		return this.dragonStatusModT;
	}

	public void setDragonStatusModT(Date dragonStatusModT) {
		this.dragonStatusModT = dragonStatusModT;
	}

	public Date getEffT() {
		return this.effT;
	}

	public void setEffT(Date effT) {
		this.effT = effT;
	}

	public String getExtendCoverageRptBy() {
		return this.extendCoverageRptBy;
	}

	public void setExtendCoverageRptBy(String extendCoverageRptBy) {
		this.extendCoverageRptBy = extendCoverageRptBy;
	}

	public Date getExtendCoverageRptDate() {
		return this.extendCoverageRptDate;
	}

	public void setExtendCoverageRptDate(Date extendCoverageRptDate) {
		this.extendCoverageRptDate = extendCoverageRptDate;
	}

	public String getEyeType() {
		return this.eyeType;
	}

	public void setEyeType(String eyeType) {
		this.eyeType = eyeType;
	}

	public String getFailedReason() {
		return this.failedReason;
	}

	public void setFailedReason(String failedReason) {
		this.failedReason = failedReason;
	}

	public String getFallbackInd() {
		return this.fallbackInd;
	}

	public void setFallbackInd(String fallbackInd) {
		this.fallbackInd = fallbackInd;
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

	public Date getFirstCallDate() {
		return this.firstCallDate;
	}

	public void setFirstCallDate(Date firstCallDate) {
		this.firstCallDate = firstCallDate;
	}

	public Date getFirstIssDate() {
		return this.firstIssDate;
	}

	public void setFirstIssDate(Date firstIssDate) {
		this.firstIssDate = firstIssDate;
	}

	public Date getFirstSrDate() {
		return this.firstSrDate;
	}

	public void setFirstSrDate(Date firstSrDate) {
		this.firstSrDate = firstSrDate;
	}

	public String getFloorNum() {
		return this.floorNum;
	}

	public void setFloorNum(String floorNum) {
		this.floorNum = floorNum;
	}

	public String getFrL1pid() {
		return this.frL1pid;
	}

	public void setFrL1pid(String frL1pid) {
		this.frL1pid = frL1pid;
	}

	public String getFrNid() {
		return this.frNid;
	}

	public void setFrNid(String frNid) {
		this.frNid = frNid;
	}

	public String getFrStbtype() {
		return this.frStbtype;
	}

	public void setFrStbtype(String frStbtype) {
		this.frStbtype = frStbtype;
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

	public Long getGon() {
		return this.gon;
	}

	public void setGon(Long gon) {
		this.gon = gon;
	}

	public String getHlotNum() {
		return this.hlotNum;
	}

	public void setHlotNum(String hlotNum) {
		this.hlotNum = hlotNum;
	}

	public String getIssStaffId() {
		return this.issStaffId;
	}

	public void setIssStaffId(String issStaffId) {
		this.issStaffId = issStaffId;
	}

	public String getL1OrderNo() {
		return this.l1OrderNo;
	}

	public void setL1OrderNo(String l1OrderNo) {
		this.l1OrderNo = l1OrderNo;
	}

	public String getL2Job() {
		return this.l2Job;
	}

	public void setL2Job(String l2Job) {
		this.l2Job = l2Job;
	}

	public String getL2ModemCode() {
		return this.l2ModemCode;
	}

	public void setL2ModemCode(String l2ModemCode) {
		this.l2ModemCode = l2ModemCode;
	}

	public String getL2ModemGrp() {
		return this.l2ModemGrp;
	}

	public void setL2ModemGrp(String l2ModemGrp) {
		this.l2ModemGrp = l2ModemGrp;
	}

	public String getL2ordnum() {
		return this.l2ordnum;
	}

	public void setL2ordnum(String l2ordnum) {
		this.l2ordnum = l2ordnum;
	}

	public String getLdlotNum() {
		return this.ldlotNum;
	}

	public void setLdlotNum(String ldlotNum) {
		this.ldlotNum = ldlotNum;
	}

	public Date getLegacyComplDate() {
		return this.legacyComplDate;
	}

	public void setLegacyComplDate(Date legacyComplDate) {
		this.legacyComplDate = legacyComplDate;
	}

	public String getLotHseInd() {
		return this.lotHseInd;
	}

	public void setLotHseInd(String lotHseInd) {
		this.lotHseInd = lotHseInd;
	}

	public Date getModT() {
		return this.modT;
	}

	public void setModT(Date modT) {
		this.modT = modT;
	}

	public String getModemCode() {
		return this.modemCode;
	}

	public void setModemCode(String modemCode) {
		this.modemCode = modemCode;
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

	public String getNextSystem() {
		return this.nextSystem;
	}

	public void setNextSystem(String nextSystem) {
		this.nextSystem = nextSystem;
	}

	public String getOcId() {
		return this.ocId;
	}

	public void setOcId(String ocId) {
		this.ocId = ocId;
	}

	public String getOnDmdPonSb() {
		return this.onDmdPonSb;
	}

	public void setOnDmdPonSb(String onDmdPonSb) {
		this.onDmdPonSb = onDmdPonSb;
	}

	public Date getOrdComplDate() {
		return this.ordComplDate;
	}

	public void setOrdComplDate(Date ordComplDate) {
		this.ordComplDate = ordComplDate;
	}

	public String getOrdsubtype() {
		return this.ordsubtype;
	}

	public void setOrdsubtype(String ordsubtype) {
		this.ordsubtype = ordsubtype;
	}

	public String getPlanningTeam() {
		return this.planningTeam;
	}

	public void setPlanningTeam(String planningTeam) {
		this.planningTeam = planningTeam;
	}

	public String getPlatformInd() {
		return this.platformInd;
	}

	public void setPlatformInd(String platformInd) {
		this.platformInd = platformInd;
	}

	public String getProdgrp() {
		return this.prodgrp;
	}

	public void setProdgrp(String prodgrp) {
		this.prodgrp = prodgrp;
	}

	public String getProjCode() {
		return this.projCode;
	}

	public void setProjCode(String projCode) {
		this.projCode = projCode;
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

	public Long getReqBandwidth() {
		return this.reqBandwidth;
	}

	public void setReqBandwidth(Long reqBandwidth) {
		this.reqBandwidth = reqBandwidth;
	}

	public String getResourceUsedUpBy() {
		return this.resourceUsedUpBy;
	}

	public void setResourceUsedUpBy(String resourceUsedUpBy) {
		this.resourceUsedUpBy = resourceUsedUpBy;
	}

	public Date getResourceUsedUpDate() {
		return this.resourceUsedUpDate;
	}

	public void setResourceUsedUpDate(Date resourceUsedUpDate) {
		this.resourceUsedUpDate = resourceUsedUpDate;
	}

	public String getResourceUsedUpReason() {
		return this.resourceUsedUpReason;
	}

	public void setResourceUsedUpReason(String resourceUsedUpReason) {
		this.resourceUsedUpReason = resourceUsedUpReason;
	}

	public String getResourceUsedUpRemark() {
		return this.resourceUsedUpRemark;
	}

	public void setResourceUsedUpRemark(String resourceUsedUpRemark) {
		this.resourceUsedUpRemark = resourceUsedUpRemark;
	}

	public Date getResumeRptDate() {
		return this.resumeRptDate;
	}

	public void setResumeRptDate(Date resumeRptDate) {
		this.resumeRptDate = resumeRptDate;
	}

	public String getSalesType() {
		return this.salesType;
	}

	public void setSalesType(String salesType) {
		this.salesType = salesType;
	}

	public String getSectCd() {
		return this.sectCd;
	}

	public void setSectCd(String sectCd) {
		this.sectCd = sectCd;
	}

	public Date getServReqDate() {
		return this.servReqDate;
	}

	public void setServReqDate(Date servReqDate) {
		this.servReqDate = servReqDate;
	}

	public String getServiceCd() {
		return this.serviceCd;
	}

	public void setServiceCd(String serviceCd) {
		this.serviceCd = serviceCd;
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

	public String getStCatgCd() {
		return this.stCatgCd;
	}

	public void setStCatgCd(String stCatgCd) {
		this.stCatgCd = stCatgCd;
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

	public Date getStillFalloutRptDate() {
		return this.stillFalloutRptDate;
	}

	public void setStillFalloutRptDate(Date stillFalloutRptDate) {
		this.stillFalloutRptDate = stillFalloutRptDate;
	}

	public String getStreetName() {
		return this.streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getStreetNum() {
		return this.streetNum;
	}

	public void setStreetNum(String streetNum) {
		this.streetNum = streetNum;
	}

	public String getSysMsg() {
		return this.sysMsg;
	}

	public void setSysMsg(String sysMsg) {
		this.sysMsg = sysMsg;
	}

	public Date getTermT() {
		return this.termT;
	}

	public void setTermT(Date termT) {
		this.termT = termT;
	}

	public String getToL1pid() {
		return this.toL1pid;
	}

	public void setToL1pid(String toL1pid) {
		this.toL1pid = toL1pid;
	}

	public String getToStbtype() {
		return this.toStbtype;
	}

	public void setToStbtype(String toStbtype) {
		this.toStbtype = toStbtype;
	}

	public Long getUimOrdOid() {
		return this.uimOrdOid;
	}

	public void setUimOrdOid(Long uimOrdOid) {
		this.uimOrdOid = uimOrdOid;
	}

	public String getUimOrdOtype() {
		return this.uimOrdOtype;
	}

	public void setUimOrdOtype(String uimOrdOtype) {
		this.uimOrdOtype = uimOrdOtype;
	}

	public String getUimOrdSubtype() {
		return this.uimOrdSubtype;
	}

	public void setUimOrdSubtype(String uimOrdSubtype) {
		this.uimOrdSubtype = uimOrdSubtype;
	}

	public String getUimOrdSys() {
		return this.uimOrdSys;
	}

	public void setUimOrdSys(String uimOrdSys) {
		this.uimOrdSys = uimOrdSys;
	}

	public String getUimOrdType() {
		return this.uimOrdType;
	}

	public void setUimOrdType(String uimOrdType) {
		this.uimOrdType = uimOrdType;
	}

	public String getUimTordType() {
		return this.uimTordType;
	}

	public void setUimTordType(String uimTordType) {
		this.uimTordType = uimTordType;
	}

	public String getUnitNum() {
		return this.unitNum;
	}

	public void setUnitNum(String unitNum) {
		this.unitNum = unitNum;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getWiringStatus() {
		return this.wiringStatus;
	}

	public void setWiringStatus(String wiringStatus) {
		this.wiringStatus = wiringStatus;
	}

	public String getWiringStatusUpdBy() {
		return this.wiringStatusUpdBy;
	}

	public void setWiringStatusUpdBy(String wiringStatusUpdBy) {
		this.wiringStatusUpdBy = wiringStatusUpdBy;
	}

	public Date getWiringStatusUpdDate() {
		return this.wiringStatusUpdDate;
	}

	public void setWiringStatusUpdDate(Date wiringStatusUpdDate) {
		this.wiringStatusUpdDate = wiringStatusUpdDate;
	}

	public Imsl1pid getToImsl1pid() {
		return toImsl1pid;
	}

	public void setToImsl1pid(Imsl1pid toImsl1pid) {
		this.toImsl1pid = toImsl1pid;
	}

	public Imsl1pid getFromImsL1pid() {
		return fromImsL1pid;
	}

	public void setFromImsL1pid(Imsl1pid fromImsL1pid) {
		this.fromImsL1pid = fromImsL1pid;
	}
}