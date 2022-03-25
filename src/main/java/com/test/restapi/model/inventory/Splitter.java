package com.test.restapi.model.inventory;

public class Splitter extends AbstractCard {
    
    public String splitterType; 
    public String floor; 
    public String oltId; 
    public String ontId; 
    public String slotId; 
    public String interfaceId; 
    
    public String getSplitterType() {
        return splitterType;
    }
    public void setSplitterType(String splitterType) {
        this.splitterType = splitterType;
    }
    public String getFloor() {
        return floor;
    }
    public void setFloor(String floor) {
        this.floor = floor;
    }
    public String getOltId() {
        return oltId;
    }
    public void setOltId(String oltId) {
        this.oltId = oltId;
    }
    public String getOntId() {
        return ontId;
    }
    public void setOntId(String ontId) {
        this.ontId = ontId;
    }
    public String getSlotId() {
        return slotId;
    }
    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }
    public String getInterfaceId() {
        return interfaceId;
    }
    public void setInterfaceId(String interfaceId) {
        this.interfaceId = interfaceId;
    }
    @Override
    public String toString() {
        return "Splitter [floor=" + floor + ", interfaceId=" + interfaceId + ", oltId=" + oltId + ", ontId=" + ontId
                + ", slotId=" + slotId + ", splitterType=" + splitterType + ", " + super.toString() + "]";
    } 

    
}
