package com.test.restapi.services.print;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestPrintServiceTest {
    
    @Autowired
    TestPrintService testPrintService; 
    
    private static final Logger logger = LogManager.getLogger(TestPrintServiceTest.class);  

    @Test
    void testListAllPrinter() {
        logger.info("--------- start testing --------------");   
        testPrintService.listAllPrinter();    
        logger.info("--------- end testing --------------");    
    }
}
