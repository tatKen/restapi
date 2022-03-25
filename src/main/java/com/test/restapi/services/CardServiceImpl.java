package com.test.restapi.services;

import com.test.restapi.domain.UimCardModel;
import com.test.restapi.repositories.CardRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CardServiceImpl implements CardService{

    private final CardRepository cardRepository;

    public CardServiceImpl(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Override
    public UimCardModel getCardByName(String name) {
        System.out.println("Starting getCardServiceByName ------------------- ");

        Iterable<UimCardModel> all = cardRepository.findAll();

        System.out.println("find all recordCnt="+cardRepository.count());
        System.out.printf("iterable count=", all.toString());

        Optional<UimCardModel> cards = cardRepository.findByName("WTSF890");

        long recordCnt = cardRepository.count();

        System.out.println("recordCnt="+recordCnt);

        System.out.println("Complete getCardServiceByName ------------------- ");

        return cards.get();
    }
}


