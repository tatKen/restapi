package com.test.restapi.services.inventory;

import com.test.restapi.model.biz.UpdateSplitterNamerRespDTO;

public interface SplitterService extends AbstractCardService{
    public UpdateSplitterNamerRespDTO updateSplitterName() throws Exception; 
}
