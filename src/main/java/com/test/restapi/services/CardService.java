package com.test.restapi.services;

import com.test.restapi.domain.UimCardModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;

public interface CardService {
    public UimCardModel getCardByName(String name);
}



