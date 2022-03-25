package com.test.restapi.model.common;

public abstract class BaseResponseDTO {
    public respReturnCode rtnCode; 
    public String rtnMsg; 

    public enum respReturnCode { OK, FAIL}

    public respReturnCode getRtnCode() {
        return rtnCode;
    }

    public void setRtnCode(respReturnCode rtnCode) {
        this.rtnCode = rtnCode;
    }

    public String getRtnMsg() {
        return rtnMsg;
    }

    public void setRtnMsg(String rtnMsg) {
        this.rtnMsg = rtnMsg;
    }

    @Override
    public String toString() {
        return "BaseResponseDTO [rtnCode=" + rtnCode + ", rtnMsg=" + rtnMsg + "]";
    };  
}
