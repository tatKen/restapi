package com.test.restapi.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the UIM2IMS database table.
 * 
 */
@Embeddable
@Table(name="UIM2IMS")
@NamedQuery(name="Uim2im.findAll", query="SELECT u FROM Uim2im u")
public class Uim2ims implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACTION")
	private String action;

	@Column(name="ACTION_SEQ")
	private Long actionSeq;

	@Column(name="BSN_NO")
	private String bsnNo;

	@Column(name="BW_2N")
	private String bw2n;

	@Column(name="CXS_ORDER_NO")
	private String cxsOrderNo;

	@Column(name="E_CARD_ID")
	private String eCardId;

	@Column(name="E_CARD_STATUS")
	private String eCardStatus;

	@Column(name="E_CARD_TYPE")
	private String eCardType;

	@Column(name="E_INSTALL_FLOOR")
	private String eInstallFloor;

	@Column(name="E_PORT_ID")
	private String ePortId;

	@Column(name="E_PORT_STATUS")
	private String ePortStatus;

	@Column(name="F_INTF_NUMBER")
	private String fIntfNumber;

	@Column(name="F_MODEM_CD")
	private String fModemCd;

	@Column(name="F_MODEM_DESC")
	private String fModemDesc;

	@Column(name="F_NIDEN")
	private String fNiden;

	@Column(name="F_OLT")
	private String fOlt;

	@Column(name="F_ONT_ID")
	private String fOntId;

	@Column(name="F_PLATFORM_IND")
	private String fPlatformInd;

	@Column(name="F_SLOT_ID")
	private String fSlotId;

	@Column(name="F_VENDOR_IND")
	private String fVendorInd;

	@Column(name="FAILED_REASON")
	private String failedReason;

	@Column(name="GON")
	private Long gon;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="IMS_ACK_DATE")
	private Date imsAckDate;

	@Column(name="IMS_ACK_IND")
	private String imsAckInd;

	@Column(name="INV_CHG_IND")
	private String invChgInd;

	@Column(name="L1ORDNUM")
	private String l1ordnum;

	@Column(name="L1SEQNO")
	private int l1seqno;

	@Column(name="L2ORDNUM")
	private String l2ordnum;

	@Column(name="L2SEQNO")
	private int l2seqno;

	@Column(name="OCID")
	private String ocid;

	@Column(name="OPROD_ID")
	private Long oprodId;

	@Column(name="ORDERTYP")
	private String ordertyp;

	@Column(name="ORDSTSCD")
	private String ordstscd;

	@Column(name="PROD_ID")
	private Long prodId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="REAL_DATE")
	private Date realDate;

	@Column(name="REAL_ID")
	private String realId;

	@Column(name="REQUEST_ID")
	private int requestId;

	@Column(name="REQUEST_ITEM_ID")
	private int requestItemId;

	@Column(name="S_CABLE_CD")
	private String sCableCd;

	@Column(name="S_CARD_ID")
	private String sCardId;

	@Column(name="S_CARD_STATUS")
	private String sCardStatus;

	@Column(name="S_CARD_TYPE")
	private String sCardType;

	@Column(name="S_EXCHANGE_TERM_A")
	private String sExchangeTermA;

	@Column(name="S_EXCHANGE_TERM_B")
	private String sExchangeTermB;

	@Column(name="S_INSTALL_FLOOR")
	private String sInstallFloor;

	@Column(name="S_PORT_ID")
	private String sPortId;

	@Column(name="S_PORT_STATUS")
	private String sPortStatus;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="SEND2CXS_DATE")
	private Date send2cxsDate;

	@Column(name="SERVICE_NO_PREFIX")
	private String serviceNoPrefix;

	@Column(name="SRC_NID")
	private String srcNid;

	@Column(name="SYSTEM_CODE")
	private String systemCode;

	@Column(name="T_INTF_NUMBER")
	private String tIntfNumber;

	@Column(name="T_MODEM_CD")
	private String tModemCd;

	@Column(name="T_MODEM_DESC")
	private String tModemDesc;

	@Column(name="T_NIDEN")
	private String tNiden;

	@Column(name="T_OLT")
	private String tOlt;

	@Column(name="T_ONT_ID")
	private String tOntId;

	@Column(name="T_PLATFORM_IND")
	private String tPlatformInd;

	@Column(name="T_SLOT_ID")
	private String tSlotId;

	@Column(name="T_VENDOR_IND")
	private String tVendorInd;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TIMESTP")
	private Date timestp;

	@Column(name="TORDTYPE")
	private String tordtype;

	@Column(name="TP_CODE")
	private String tpCode;

	@Column(name="TRG_NID")
	private String trgNid;

	@Column(name="TRY_CNT")
	private int tryCnt;

	@Column(name="UIM_ORD_ID")
	private Long uimOrdId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UIM_ORD_PROCESS_DATE")
	private Date uimOrdProcessDate;

	@Column(name="XACTTYPE")
	private String xacttype;

	public Uim2ims() {
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Long getActionSeq() {
		return this.actionSeq;
	}

	public void setActionSeq(Long actionSeq) {
		this.actionSeq = actionSeq;
	}

	public String getBsnNo() {
		return this.bsnNo;
	}

	public void setBsnNo(String bsnNo) {
		this.bsnNo = bsnNo;
	}

	public String getBw2n() {
		return this.bw2n;
	}

	public void setBw2n(String bw2n) {
		this.bw2n = bw2n;
	}

	public String getCxsOrderNo() {
		return this.cxsOrderNo;
	}

	public void setCxsOrderNo(String cxsOrderNo) {
		this.cxsOrderNo = cxsOrderNo;
	}

	public String getECardId() {
		return this.eCardId;
	}

	public void setECardId(String eCardId) {
		this.eCardId = eCardId;
	}

	public String getECardStatus() {
		return this.eCardStatus;
	}

	public void setECardStatus(String eCardStatus) {
		this.eCardStatus = eCardStatus;
	}

	public String getECardType() {
		return this.eCardType;
	}

	public void setECardType(String eCardType) {
		this.eCardType = eCardType;
	}

	public String getEInstallFloor() {
		return this.eInstallFloor;
	}

	public void setEInstallFloor(String eInstallFloor) {
		this.eInstallFloor = eInstallFloor;
	}

	public String getEPortId() {
		return this.ePortId;
	}

	public void setEPortId(String ePortId) {
		this.ePortId = ePortId;
	}

	public String getEPortStatus() {
		return this.ePortStatus;
	}

	public void setEPortStatus(String ePortStatus) {
		this.ePortStatus = ePortStatus;
	}

	public String getFIntfNumber() {
		return this.fIntfNumber;
	}

	public void setFIntfNumber(String fIntfNumber) {
		this.fIntfNumber = fIntfNumber;
	}

	public String getFModemCd() {
		return this.fModemCd;
	}

	public void setFModemCd(String fModemCd) {
		this.fModemCd = fModemCd;
	}

	public String getFModemDesc() {
		return this.fModemDesc;
	}

	public void setFModemDesc(String fModemDesc) {
		this.fModemDesc = fModemDesc;
	}

	public String getFNiden() {
		return this.fNiden;
	}

	public void setFNiden(String fNiden) {
		this.fNiden = fNiden;
	}

	public String getFOlt() {
		return this.fOlt;
	}

	public void setFOlt(String fOlt) {
		this.fOlt = fOlt;
	}

	public String getFOntId() {
		return this.fOntId;
	}

	public void setFOntId(String fOntId) {
		this.fOntId = fOntId;
	}

	public String getFPlatformInd() {
		return this.fPlatformInd;
	}

	public void setFPlatformInd(String fPlatformInd) {
		this.fPlatformInd = fPlatformInd;
	}

	public String getFSlotId() {
		return this.fSlotId;
	}

	public void setFSlotId(String fSlotId) {
		this.fSlotId = fSlotId;
	}

	public String getFVendorInd() {
		return this.fVendorInd;
	}

	public void setFVendorInd(String fVendorInd) {
		this.fVendorInd = fVendorInd;
	}

	public String getFailedReason() {
		return this.failedReason;
	}

	public void setFailedReason(String failedReason) {
		this.failedReason = failedReason;
	}

	public Long getGon() {
		return this.gon;
	}

	public void setGon(Long gon) {
		this.gon = gon;
	}

	public Date getImsAckDate() {
		return this.imsAckDate;
	}

	public void setImsAckDate(Date imsAckDate) {
		this.imsAckDate = imsAckDate;
	}

	public String getImsAckInd() {
		return this.imsAckInd;
	}

	public void setImsAckInd(String imsAckInd) {
		this.imsAckInd = imsAckInd;
	}

	public String getInvChgInd() {
		return this.invChgInd;
	}

	public void setInvChgInd(String invChgInd) {
		this.invChgInd = invChgInd;
	}

	public String getL1ordnum() {
		return this.l1ordnum;
	}

	public void setL1ordnum(String l1ordnum) {
		this.l1ordnum = l1ordnum;
	}

	public int getL1seqno() {
		return this.l1seqno;
	}

	public void setL1seqno(int l1seqno) {
		this.l1seqno = l1seqno;
	}

	public String getL2ordnum() {
		return this.l2ordnum;
	}

	public void setL2ordnum(String l2ordnum) {
		this.l2ordnum = l2ordnum;
	}

	public int getL2seqno() {
		return this.l2seqno;
	}

	public void setL2seqno(int l2seqno) {
		this.l2seqno = l2seqno;
	}

	public String getOcid() {
		return this.ocid;
	}

	public void setOcid(String ocid) {
		this.ocid = ocid;
	}

	public Long getOprodId() {
		return this.oprodId;
	}

	public void setOprodId(Long oprodId) {
		this.oprodId = oprodId;
	}

	public String getOrdertyp() {
		return this.ordertyp;
	}

	public void setOrdertyp(String ordertyp) {
		this.ordertyp = ordertyp;
	}

	public String getOrdstscd() {
		return this.ordstscd;
	}

	public void setOrdstscd(String ordstscd) {
		this.ordstscd = ordstscd;
	}

	public Long getProdId() {
		return this.prodId;
	}

	public void setProdId(Long prodId) {
		this.prodId = prodId;
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

	public int getRequestId() {
		return this.requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public int getRequestItemId() {
		return this.requestItemId;
	}

	public void setRequestItemId(int requestItemId) {
		this.requestItemId = requestItemId;
	}

	public String getSCableCd() {
		return this.sCableCd;
	}

	public void setSCableCd(String sCableCd) {
		this.sCableCd = sCableCd;
	}

	public String getSCardId() {
		return this.sCardId;
	}

	public void setSCardId(String sCardId) {
		this.sCardId = sCardId;
	}

	public String getSCardStatus() {
		return this.sCardStatus;
	}

	public void setSCardStatus(String sCardStatus) {
		this.sCardStatus = sCardStatus;
	}

	public String getSCardType() {
		return this.sCardType;
	}

	public void setSCardType(String sCardType) {
		this.sCardType = sCardType;
	}

	public String getSExchangeTermA() {
		return this.sExchangeTermA;
	}

	public void setSExchangeTermA(String sExchangeTermA) {
		this.sExchangeTermA = sExchangeTermA;
	}

	public String getSExchangeTermB() {
		return this.sExchangeTermB;
	}

	public void setSExchangeTermB(String sExchangeTermB) {
		this.sExchangeTermB = sExchangeTermB;
	}

	public String getSInstallFloor() {
		return this.sInstallFloor;
	}

	public void setSInstallFloor(String sInstallFloor) {
		this.sInstallFloor = sInstallFloor;
	}

	public String getSPortId() {
		return this.sPortId;
	}

	public void setSPortId(String sPortId) {
		this.sPortId = sPortId;
	}

	public String getSPortStatus() {
		return this.sPortStatus;
	}

	public void setSPortStatus(String sPortStatus) {
		this.sPortStatus = sPortStatus;
	}

	public Date getSend2cxsDate() {
		return this.send2cxsDate;
	}

	public void setSend2cxsDate(Date send2cxsDate) {
		this.send2cxsDate = send2cxsDate;
	}

	public String getServiceNoPrefix() {
		return this.serviceNoPrefix;
	}

	public void setServiceNoPrefix(String serviceNoPrefix) {
		this.serviceNoPrefix = serviceNoPrefix;
	}

	public String getSrcNid() {
		return this.srcNid;
	}

	public void setSrcNid(String srcNid) {
		this.srcNid = srcNid;
	}

	public String getSystemCode() {
		return this.systemCode;
	}

	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}

	public String getTIntfNumber() {
		return this.tIntfNumber;
	}

	public void setTIntfNumber(String tIntfNumber) {
		this.tIntfNumber = tIntfNumber;
	}

	public String getTModemCd() {
		return this.tModemCd;
	}

	public void setTModemCd(String tModemCd) {
		this.tModemCd = tModemCd;
	}

	public String getTModemDesc() {
		return this.tModemDesc;
	}

	public void setTModemDesc(String tModemDesc) {
		this.tModemDesc = tModemDesc;
	}

	public String getTNiden() {
		return this.tNiden;
	}

	public void setTNiden(String tNiden) {
		this.tNiden = tNiden;
	}

	public String getTOlt() {
		return this.tOlt;
	}

	public void setTOlt(String tOlt) {
		this.tOlt = tOlt;
	}

	public String getTOntId() {
		return this.tOntId;
	}

	public void setTOntId(String tOntId) {
		this.tOntId = tOntId;
	}

	public String getTPlatformInd() {
		return this.tPlatformInd;
	}

	public void setTPlatformInd(String tPlatformInd) {
		this.tPlatformInd = tPlatformInd;
	}

	public String getTSlotId() {
		return this.tSlotId;
	}

	public void setTSlotId(String tSlotId) {
		this.tSlotId = tSlotId;
	}

	public String getTVendorInd() {
		return this.tVendorInd;
	}

	public void setTVendorInd(String tVendorInd) {
		this.tVendorInd = tVendorInd;
	}

	public Date getTimestp() {
		return this.timestp;
	}

	public void setTimestp(Date timestp) {
		this.timestp = timestp;
	}

	public String getTordtype() {
		return this.tordtype;
	}

	public void setTordtype(String tordtype) {
		this.tordtype = tordtype;
	}

	public String getTpCode() {
		return this.tpCode;
	}

	public void setTpCode(String tpCode) {
		this.tpCode = tpCode;
	}

	public String getTrgNid() {
		return this.trgNid;
	}

	public void setTrgNid(String trgNid) {
		this.trgNid = trgNid;
	}

	public int getTryCnt() {
		return this.tryCnt;
	}

	public void setTryCnt(int tryCnt) {
		this.tryCnt = tryCnt;
	}

	public Long getUimOrdId() {
		return this.uimOrdId;
	}

	public void setUimOrdId(Long uimOrdId) {
		this.uimOrdId = uimOrdId;
	}

	public Date getUimOrdProcessDate() {
		return this.uimOrdProcessDate;
	}

	public void setUimOrdProcessDate(Date uimOrdProcessDate) {
		this.uimOrdProcessDate = uimOrdProcessDate;
	}

	public String getXacttype() {
		return this.xacttype;
	}

	public void setXacttype(String xacttype) {
		this.xacttype = xacttype;
	}

}