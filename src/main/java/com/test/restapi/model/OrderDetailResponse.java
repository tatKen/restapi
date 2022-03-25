package com.test.restapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class OrderDetailResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("l1_order_no")
    private String l1OrderNo;

    @JsonProperty("ref_service_type")
    private String refSrvType;

    @JsonProperty("ref_service_no")
    private String refSrvNo;

    @JsonProperty("customer_name")
    private String customerName;

    @JsonProperty("deployment_method")
    private String deployMethod;

    @JsonProperty("deployment_scenario")
    private String deployScenario;

    @JsonProperty("order_status")
    private String status;

    @JsonProperty("failed_reason")
    private String failedReason;

    @JsonProperty("service_request_date")
    private Date servReqDate;

    @JsonProperty("status_date")
    private Date statusDate;

    @JsonProperty("create_date")
    private Date createdDate;

    @JsonProperty("from_l1pid")
    private String fromL1Pid;

    @JsonProperty("from_stbtype")
    private String fromStbType;

    @JsonProperty("from_product_desc")
    private String fromPrdDesc;

    @JsonProperty("to_l1pid")
    private String toL1Pid;

    @JsonProperty("to_stbtype")
    private String toStbType;

    @JsonProperty("to_product_desc")
    private String toPrdDesc;

    @JsonProperty("to_bw_s")
    private String toBwS;

    @JsonProperty("to_bw_b")
    private String toBwB;

    @JsonProperty("to_bw_p")
    private String toBwP;

    @JsonProperty("to_bw_v")
    private String toBwV;

    @JsonProperty("service_code")
    private String serviceCode;

    @JsonProperty("service_code_desc")
    private String serviceDesc;

    @JsonProperty("vendor")
    private String vendor;

    @JsonProperty("platform")
    private String platform;

    @JsonProperty("phyconn_info")
    private List<PhyconnResponse> phyconns;

    @JsonProperty("nid_info")
    private NidResponse nidInfo;

    public OrderDetailResponse() {
    }

    public String getL1OrderNo() {
        return l1OrderNo;
    }

    public void setL1OrderNo(String l1OrderNo) {
        this.l1OrderNo = l1OrderNo;
    }

    public String getRefSrvType() {
        return refSrvType;
    }

    public void setRefSrvType(String refSrvType) {
        this.refSrvType = refSrvType;
    }

    public String getRefSrvNo() {
        return refSrvNo;
    }

    public void setRefSrvNo(String refSrvNo) {
        this.refSrvNo = refSrvNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDeployMethod() {
        return deployMethod;
    }

    public void setDeployMethod(String deployMethod) {
        this.deployMethod = deployMethod;
    }

    public String getDeployScenario() {
        return deployScenario;
    }

    public void setDeployScenario(String deployScenario) {
        this.deployScenario = deployScenario;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    public Date getServReqDate() {
        return servReqDate;
    }

    public void setServReqDate(Date servReqDate) {
        this.servReqDate = servReqDate;
    }

    public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getFromL1Pid() {
        return fromL1Pid;
    }

    public void setFromL1Pid(String fromL1Pid) {
        this.fromL1Pid = fromL1Pid;
    }

    public String getFromStbType() {
        return fromStbType;
    }

    public void setFromStbType(String fromStbType) {
        this.fromStbType = fromStbType;
    }

    public String getFromPrdDesc() {
        return fromPrdDesc;
    }

    public void setFromPrdDesc(String fromPrdDesc) {
        this.fromPrdDesc = fromPrdDesc;
    }

    public String getToL1Pid() {
        return toL1Pid;
    }

    public void setToL1Pid(String toL1Pid) {
        this.toL1Pid = toL1Pid;
    }

    public String getToStbType() {
        return toStbType;
    }

    public void setToStbType(String toStbType) {
        this.toStbType = toStbType;
    }

    public String getToPrdDesc() {
        return toPrdDesc;
    }

    public void setToPrdDesc(String toPrdDesc) {
        this.toPrdDesc = toPrdDesc;
    }

    public String getToBwS() {
        return toBwS;
    }

    public void setToBwS(String toBwS) {
        this.toBwS = toBwS;
    }

    public String getToBwB() {
        return toBwB;
    }

    public void setToBwB(String toBwB) {
        this.toBwB = toBwB;
    }

    public String getToBwP() {
        return toBwP;
    }

    public void setToBwP(String toBwP) {
        this.toBwP = toBwP;
    }

    public String getToBwV() {
        return toBwV;
    }

    public void setToBwV(String toBwV) {
        this.toBwV = toBwV;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceDesc() {
        return serviceDesc;
    }

    public void setServiceDesc(String serviceDesc) {
        this.serviceDesc = serviceDesc;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public List<PhyconnResponse> getPhyconns() {
        return phyconns;
    }

    public void setPhyconns(List<PhyconnResponse> phyconns) {
        this.phyconns = phyconns;
    }

    public NidResponse getNidInfo() {
        return nidInfo;
    }

    public void setNidInfo(NidResponse nidInfo) {
        this.nidInfo = nidInfo;
    }

    @Override
    public String toString() {
        return "OrderDetailResponse{" +
                "l1OrderNo='" + l1OrderNo + '\'' +
                ", refSrvType='" + refSrvType + '\'' +
                ", refSrvNo='" + refSrvNo + '\'' +
                ", customerName='" + customerName + '\'' +
                ", deployMethod='" + deployMethod + '\'' +
                ", deployScenario='" + deployScenario + '\'' +
                ", status='" + status + '\'' +
                ", failedReason='" + failedReason + '\'' +
                ", servReqDate=" + servReqDate +
                ", statusDate=" + statusDate +
                ", createdDate=" + createdDate +
                ", fromL1Pid='" + fromL1Pid + '\'' +
                ", fromStbType='" + fromStbType + '\'' +
                ", fromPrdDesc='" + fromPrdDesc + '\'' +
                ", toL1Pid='" + toL1Pid + '\'' +
                ", toStbType='" + toStbType + '\'' +
                ", toPrdDesc='" + toPrdDesc + '\'' +
                ", toBwS='" + toBwS + '\'' +
                ", toBwB='" + toBwB + '\'' +
                ", toBwP='" + toBwP + '\'' +
                ", toBwV='" + toBwV + '\'' +
                ", serviceCode='" + serviceCode + '\'' +
                ", serviceDesc='" + serviceDesc + '\'' +
                ", vendor='" + vendor + '\'' +
                ", platform='" + platform + '\'' +
                ", phyconns=" + phyconns +
                ", nidInfo=" + nidInfo +
                '}';
    }
}
