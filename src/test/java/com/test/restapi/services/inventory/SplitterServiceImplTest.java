package com.test.restapi.services.inventory;

import com.test.restapi.model.biz.UpdateSplitterNamerRespDTO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SplitterServiceImplTest {
    
    public static final Logger logger = LogManager.getLogger(SplitterServiceImplTest.class);   

    @Autowired 
    SplitterService splitterService;   
    
    @Test
    void testUpdateSplitterName() {
        logger.info("------------- start test SplitterServiceImplTest -------------");  
        
        try {
            UpdateSplitterNamerRespDTO rtnDto = splitterService.updateSplitterName(); 
        } catch(Exception e) {
            e.printStackTrace();       
        }
        logger.info("------------- complete test SplitterServiceImplTest -------------");   
    }
}




