package com.gap.training.service;

import com.gap.training.been.Order;
import com.gap.training.repository.OrderJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl {
    @Autowired
    OrderJdbcRepository repository;
    public List<Order> findAllOrders(){
        return this.repository.findAllOrders();
    }
    public Order findById(int id){
        return this.repository.findById(id);
    }
}
