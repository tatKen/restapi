package com.test.restapi.services.print;

import javax.print.PrintService;
import javax.print.PrintServiceLookup;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class TestPrintService {
    
    private static final Logger logger = LogManager.getLogger(TestPrintService.class); 

    public void listAllPrinter(){
        PrintService[] printers = PrintServiceLookup.lookupPrintServices(null, null); 

        logger.info("No. of printers detected=" + printers.length);   

        for(PrintService printer : printers){
            logger.info("Printer name=" + printer.getName());    
        }
    }
}
