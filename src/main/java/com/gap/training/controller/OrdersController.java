package com.gap.training.controller;


import com.gap.training.been.Order;
import com.gap.training.service.OrderServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path="/v1")
public class OrdersController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    OrderServiceImpl orderService;

    @GetMapping("/orders")
    public ResponseEntity<List<Order>> getOrders(){
       return ResponseEntity.status(HttpStatus.OK).body(this.orderService.findAllOrders());

    }

    /**
     * This is with path parameter
     * @param id// test commit
     * @return
     */
    @GetMapping("/orders/{id}")
    public ResponseEntity<Order> getOrders(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(this.orderService.findById(id));

    }

    /**
     * This is with query parameter
     * @param id
     * @return
     * @RequestParam(defaultValue = "test") String id
     * @RequestParam Optional<String> id
     * @RequestParam(required = false) String id
     */
    @GetMapping("/ordersbyid")
    public ResponseEntity<Order> getOrdersRequestParameter(@RequestParam(name = "id") Optional<Integer> id){
        return ResponseEntity.status(HttpStatus.OK).body(this.orderService.findById(id.get()));

    }




}
