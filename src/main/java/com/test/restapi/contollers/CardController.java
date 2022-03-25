package com.test.restapi.contollers;

import com.test.restapi.services.CardService;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;
import java.util.Calendar;

@Slf4j
@Controller
@RequestMapping("card")
public class CardController {

    private final CardService cardService;
    private final static Logger logger = LogManager.getLogger(CardController.class);

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping("/{name}")
    public @ResponseBody String getCardByName(@PathParam("name") String name){
        logger.info("---------- getCardByName start "+ Calendar.getInstance().getTime() +" --------------");

        String rtnStr = cardService.getCardByName(name).toString();

        logger.info("---------- getCardByName end "+ Calendar.getInstance().getTime() +" --------------");
        return rtnStr;
    }

//    @GetMapping("/id/{id}")
//    public String getCardById(@PathVariable String id){}
}



