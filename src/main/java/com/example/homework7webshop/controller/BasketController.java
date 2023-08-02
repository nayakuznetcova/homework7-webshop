package com.example.homework7webshop.controller;

import com.example.homework7webshop.service.BasketService;
import com.example.homework7webshop.service.BasketServiceInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class BasketController {
    private final BasketServiceInterface basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public void add(@RequestParam List<Integer> list){
        basketService.add(list);
    }

    @GetMapping("/get")
    public List<Integer> get(){
        return basketService.get();
    }
}
