package com.test.restapi.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestCardTableServiceImplTest {
    @Autowired
    @Qualifier("testCardTableServiceImpl")  
    TestCardService testCardTableService; 
    
    @Test
    void testSaveCard() { 
        try{
            testCardTableService.saveCard();   
        } catch(Exception e) { 
            e.printStackTrace(); 
        } 
    }
}




