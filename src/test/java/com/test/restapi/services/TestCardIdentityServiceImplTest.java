package com.test.restapi.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest  
public class TestCardIdentityServiceImplTest {
    @Autowired
    @Qualifier("testCardIdentityServiceImpl")
    TestCardService testCardService; 
    
    @Test
    void testSaveCard() {
        try{
            testCardService.saveCard();    
        } catch(Exception e){
            e.printStackTrace(); 
        }
    }
}
