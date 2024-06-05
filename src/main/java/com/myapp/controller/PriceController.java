package com.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.service.PriceService;

import java.util.List;

@RestController
@RequestMapping("/prices")
public class PriceController {

    @Autowired
    PriceService priceService;

    @GetMapping
    public List<Double> getPrices() {
        // Logic to fetch the list of prices from the PriceService
        // Replace this with your actual implementation
        List<Double> prices = priceService.getPrices();
        return prices;
    }
}