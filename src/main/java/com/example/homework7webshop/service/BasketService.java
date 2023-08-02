package com.example.homework7webshop.service;

import com.example.homework7webshop.repository.BasketRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketService implements BasketServiceInterface{
    private final BasketRepository basketRepository;

    public BasketService(BasketRepository basketRepository) {
        this.basketRepository = basketRepository;
    }

    @Override
    public void add(List<Integer> list) {
        basketRepository.addItems(list);
    }

    @Override
    public List<Integer> get() {
        return basketRepository.getItems();
    }
}
