package com.example.foodcustomers.model;

public class Food {
    String name;
    Integer price;
    String type;
    Integer imageURL;

    public Food(String name, Integer price, String type, Integer imageURL) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getImageURL() {
        return imageURL;
    }

    public void setImageURL(Integer imageURL) {
        this.imageURL = imageURL;
    }
}
