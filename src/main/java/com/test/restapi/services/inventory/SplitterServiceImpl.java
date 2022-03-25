package com.test.restapi.services.inventory;

import java.util.List;
import java.util.stream.Collectors;

import com.test.restapi.domain.UimCardModel;
import com.test.restapi.model.biz.UpdateSplitterNamerRespDTO;
import com.test.restapi.repositories.CardRepository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SplitterServiceImpl implements SplitterService{

    public static final Logger logger = LogManager.getLogger(SplitterServiceImpl.class);  

    @Autowired
    CardRepository cardRepository; 

    @Override
    public UpdateSplitterNamerRespDTO updateSplitterName() throws Exception {
        // TODO Auto-generated method stub
        logger.info("---------  start SplitterServiceImpl updateSplitterName ----------------");     
        
        UpdateSplitterNamerRespDTO rtnDto = new UpdateSplitterNamerRespDTO();     

        // Get all the card with type splitter 
        // List<UimCardModel> cards = cardRepository.findAll(); 
        List<UimCardModel> cards = cardRepository.getCardByType("SPLITTER"); 
        
        logger.info("Original cards count="+cards.size());   

        // filter the dummy 
        List<UimCardModel> originalCards = cards.stream().filter(dto -> dto.getName().contains("TRIAL")).collect(Collectors.toList());   

        logger.info("Filtered cards count="+originalCards.size());   

        // for each if it is S3 update dummy to trial
        for(UimCardModel eachCard : originalCards){
            String newName = eachCard.getName().replace("TRIAL", "DUMMY"); 
            eachCard.setName(newName);
            cardRepository.saveAndFlush(eachCard); 
        }  

        // map back the filter to original list 
               


        /*  
        if (!CommonUtil.isNullOrEmpty(response)) {
            ObjectMapper objectMapper = new ObjectMapper();
            
            NexStoreFileInfoResponseDTO responseDto = objectMapper.readValue(response, NexStoreFileInfoResponseDTO.class);
            if (!CommonUtil.isNull(responseDto) && !CommonUtil.isNullOrEmpty(responseDto.getOutputlist())) {
                responseDto.getOutputlist().stream().forEach(out -> {
                    dtos.stream().filter(dto -> (dto.getFileInfoId() == out.getFileInfoId() && Mode.SIGN_WITH_WATERMARK.toString().equals(dto.getMode()))).forEach(dto -> {
                        try {
                            dto.setFilePath(convertWindowsToLinuxPath(out.getFilePath(), builder));
                        } catch (IOException e) {
                            e.printStackTrace();
                            EventLogWrapper.parameter(builder, "error", e.getMessage());
                        }
                    });
                });
            }
        }
        */ 

        // return the whole list 

        logger.info("---------  complete SplitterServiceImpl updateSplitterName ----------------");     

        return rtnDto; 
    }

    @Override
    public String displayName() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
    
}
