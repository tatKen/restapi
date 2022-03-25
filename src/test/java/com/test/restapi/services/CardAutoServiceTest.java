package com.test.restapi.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CardAutoServiceTest {
    @Autowired
    @Qualifier("testCardAutoServiceImpl")
    TestCardService testCardAutoService; 

    @Test 
    public void testSave(){
        try{ 
            testCardAutoService.saveCard();   
        } catch(Exception e) {
            e.printStackTrace();     
        } 
    }
}
