package com.example.stock_kafka.services;

import org.springframework.stereotype.Service;

import com.example.stock_kafka.data.Stock;

@Service
public class StockService {

    private Stock stock;

    public StockService() {
        stock = new Stock();
    }   

    public void refill(){
        stock.addStock("Chaise", 4);
        stock.addStock("Table", 2);
        stock.addStock("Lit", 3);
    }

    public Stock getStock() {
        return stock;
    }
    
}
