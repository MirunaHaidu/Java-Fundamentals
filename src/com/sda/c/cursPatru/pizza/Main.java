package com.sda.c.cursPatru.pizza;

public class Main {
    //avem un magazin de pizza
    // avem 3 tipuri de pizza, fiecare cu costul ei
    //vrem sa calculam cat costa totalul cand un client cumpara una sau mai multe pizza

    //Magazin
    //Pizza
    public static void main(String[] args) {

        Pizza quatroFormagiPizza = new Pizza();
        quatroFormagiPizza.setName("Quatro Formaggi");
        quatroFormagiPizza.setCrust("Italian");
        quatroFormagiPizza.setIngredients(new String[]{"ciuperci", "branza", "alta branza"});
        quatroFormagiPizza.setPrice(30.5f);

        Pizza diavolaPizza = new Pizza();
        diavolaPizza.setName("Diavola");
        diavolaPizza.setCrust("Soft");
        diavolaPizza.setIngredients(new String[]{"ciuperci", "jalapeno", "ciorizo"});
        diavolaPizza.setPrice(28.5f);

        Pizza margheritaPizza = new Pizza();
        margheritaPizza.setName("Margherita");
        margheritaPizza.setCrust("Soft");
        margheritaPizza.setIngredients(new String[]{"branza", "sos", "ciuperci"});
        margheritaPizza.setPrice(26.5f);


        PizzaShop pizzaShop = new PizzaShop();
        pizzaShop.setName("Pizza Shop");
//        pizzaShop.setMenu(new String[] {"Quatro Formaggi", "Diavola", "Margherita"});  //e error prone pt. ca le
        //poate amesteca
        pizzaShop.setPizzas((new Pizza[]{quatroFormagiPizza, diavolaPizza, margheritaPizza}));


        //aici a venit userul si a cerut optiunile de pizza
//        String[] pizzaNames = pizzaShop.getPizzas();
//        for (String s : pizzaNames){
//            System.out.println(s);
//        }

    }





}
