package com.test.restapi.services;

import java.util.Calendar;
import java.util.List;

import com.test.restapi.domain.TestCardAuto;
import com.test.restapi.repositories.TestCardAutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  
public class TestCardAutoServiceImpl implements TestCardService{

    @Autowired
    private TestCardAutoRepository testCardAutoRepository; 

    @Override
    public void saveCard() throws Exception {
        System.out.println("----------- start test card auto generated value ------------");    
        
        // TODO Auto-generated method stub
        TestCardAuto newCard = new TestCardAuto(); 
        newCard.setCardType("WM");     
        newCard.setUimCardOtype("Splitter");     
        newCard.setName("ADMDUMMYS3");    
        newCard.setStatus("W");     
        newCard.setModT(Calendar.getInstance().getTime());    
        newCard.setModifiedBy("TEST");     

        testCardAutoRepository.save(newCard); 

        testCardAutoRepository.flush();

        List<TestCardAuto> cardList = testCardAutoRepository.findAll(); 

        for(TestCardAuto item: cardList){
            System.out.println("card name="+item.getName());
            System.out.println("card type="+item.getCardType());
        }
    }
    
}



