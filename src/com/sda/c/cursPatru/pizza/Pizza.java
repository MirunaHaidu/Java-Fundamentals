package com.sda.c.cursPatru.pizza;

public class Pizza {

    private String name;
    private String crust;
    private String[] ingredients;
    private float price;

    public void setName(String name) {
        this.name = name;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCrust() {
        return crust;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public float getPrice() {
        return price;
    }
}
