package com.test.restapi.services;

import java.util.Calendar;

import com.test.restapi.domain.TestCardTable;
import com.test.restapi.repositories.TestCardTableRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestCardTableServiceImpl implements TestCardService{

    @Autowired
    TestCardTableRepository testCardTableRepository; 

    @Override
    public void saveCard() throws Exception {
        System.out.println("---------- start table generater -----------");
        
        // TODO Auto-generated method stub
        try{
            TestCardTable cardItem = new TestCardTable(); 
            cardItem.setUimCardOtype("Splitter");  
            cardItem.setCardType("WM");
            cardItem.setName("ADMDummyS3");    
            cardItem.setDescr("Splitter test for TABLE generatedType");
            cardItem.setStatus("W");
            cardItem.setModT(Calendar.getInstance().getTime());
            cardItem.setModifiedBy("Table Tester");     

            testCardTableRepository.saveAndFlush(cardItem); 

        } catch(Exception e) {
            e.printStackTrace();         
        }

        System.out.println("---------- end table generater -----------");
    }
    
}
