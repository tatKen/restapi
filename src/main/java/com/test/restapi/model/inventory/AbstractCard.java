package com.test.restapi.model.inventory;

public abstract class AbstractCard {
    
    public String name; 
    public String cardType; 
    public String status;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCardType() {
        return cardType;
    }
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "AbstractCard [cardType=" + cardType + ", name=" + name + ", status=" + status + "]";
    } 

    
}
