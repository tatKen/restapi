package com.test.restapi.services;

import java.util.Calendar;

import com.test.restapi.domain.TestCardIdentity;
import com.test.restapi.repositories.TestCardIdentityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestCardIdentityServiceImpl implements TestCardService{
    @Autowired
    TestCardIdentityRepository testCardIdentityRepository;   

    @Override
    public void saveCard() throws Exception {
        // TODO Auto-generated method stub
        try{     
            TestCardIdentity cardItem = new TestCardIdentity();   
            cardItem.setUimCardOtype("Splitter");  
            cardItem.setCardType("WM");
            cardItem.setName("ADMDummyS3");    
            cardItem.setDescr("Splitter test for TABLE generatedType Identity");  
            cardItem.setStatus("W");
            cardItem.setModT(Calendar.getInstance().getTime());
            cardItem.setModifiedBy("Table Tester");    

            testCardIdentityRepository.saveAndFlush(cardItem); 
             
        } catch(Exception e) {
            e.printStackTrace();          
        }    
    }
    
}
