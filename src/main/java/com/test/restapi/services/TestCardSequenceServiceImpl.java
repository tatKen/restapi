package com.test.restapi.services;

import java.util.Calendar;

import com.test.restapi.domain.TestCardSequence;
import com.test.restapi.repositories.TestCardSequenceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestCardSequenceServiceImpl implements TestCardService{
    @Autowired
    TestCardSequenceRepository testCardSequenceRepository;

    @Override
    public void saveCard() throws Exception {
        // TODO Auto-generated method stub
        try{     
            TestCardSequence cardItem = new TestCardSequence();   
            cardItem.setUimCardOtype("Splitter");  
            cardItem.setCardType("WM");
            cardItem.setName("ADMDummyS3");    
            cardItem.setDescr("Splitter test for Id generatedType Sequence");  
            cardItem.setStatus("W");
            cardItem.setModT(Calendar.getInstance().getTime());
            cardItem.setModifiedBy("Table Tester");    

            testCardSequenceRepository.saveAndFlush(cardItem); 
             
        } catch(Exception e) {
            e.printStackTrace();          
        }    
    } 
}
