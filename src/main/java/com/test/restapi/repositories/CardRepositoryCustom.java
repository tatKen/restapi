package com.test.restapi.repositories;

import java.util.List;

import com.test.restapi.domain.UimCardModel;

public interface CardRepositoryCustom {
    List<UimCardModel> getCardByType(String cardOType);      
}
