package com.sda.c.cursPatru.pizza;

public class PizzaShop {
    private String name;
    private String[] menu;
    private Pizza[] pizzas;


    public void setName(String name) {
        this.name = name;
    }

    public void setMenu(String[] menu) {
        this.menu = menu;
    }

//    public void setPizzas(Pizza[] pizzas) {
//        this.pizzas = pizzas;
//    }

    public void setPizzas (Pizza[] pizza){
//        this.pizzas = pizzas;
        this.menu = new String[pizzas.length];
        for (int i =0; i< pizzas.length; i++){
            this.menu[i] = pizzas[i].getName();
        }
    }

    public String getName() {
        return name;
    }

    public String[] getMenu() {
        return menu;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }

}
