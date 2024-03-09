package com.gap.training.been;

public class Order {
    private int id;
    private String name;
    private String type;
    private int price;
    private int numberOfItem;

    public Order(int id, String name, String type, int price, int numberOfItem) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.numberOfItem = numberOfItem;
    }

    public Order() {

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
