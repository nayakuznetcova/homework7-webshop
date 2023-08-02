package com.example.homework7webshop.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
@SessionScope
public class BasketRepository {
    private List<Integer> items = new ArrayList<>();

    public void addItems(List<Integer> itemsId){
        items.addAll(itemsId);
    }

    public List<Integer> getItems(){
        return Collections.unmodifiableList(items);
    }
}
