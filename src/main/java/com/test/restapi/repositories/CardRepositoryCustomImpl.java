package com.test.restapi.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.test.restapi.domain.UimCardModel;

import org.springframework.stereotype.Repository;

@Repository
public class CardRepositoryCustomImpl implements CardRepositoryCustom{
    EntityManager entityMgr; 
    
    public CardRepositoryCustomImpl() { 
        super(); 
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("arg0, arg1"); 
        entityMgr = factory.createEntityManager(); 
    }

    @Override
    public List<UimCardModel> getCardByType(String cardOType) {
        
        CriteriaBuilder cb = entityMgr.getCriteriaBuilder(); 
        CriteriaQuery<UimCardModel> query = cb.createQuery(UimCardModel.class); 

        Root<UimCardModel> root = query.from(UimCardModel.class); 
        Predicate cardTypePredicate = cb.equal(root.get("UIM_CARD_OTYPE"), cardOType); 
        query.where(cardTypePredicate); 

        TypedQuery<UimCardModel> typeQuery = entityMgr.createQuery(query); 
        return typeQuery.getResultList(); 
    }
    
}
