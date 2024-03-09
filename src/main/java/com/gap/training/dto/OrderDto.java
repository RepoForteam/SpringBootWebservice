package com.gap.training.dto;

import com.gap.training.been.Order;

public class OrderDto {
    private int id;
    private String name;
    private String type;
    private int price;
    private int numberOfItem;

    public OrderDto(int id, String name, String type, int price, int numberOfItem) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.numberOfItem = numberOfItem;
    }

    public OrderDto(Order order) {
        this.id = order.getId();
        this.name = order.getName();
        this.type = order.getType();
        this.price = order.getPrice();
        this.numberOfItem = order.getNumberOfItem();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfItem() {
        return this.numberOfItem;
    }

    public void setNumberOfItem(int numberOfItem) {
        this.numberOfItem = numberOfItem;
    }


}
