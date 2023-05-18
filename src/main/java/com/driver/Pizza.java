package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) this.price=300;
        else this.price=400;
        bill=Integer.toString(price);
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        int a=Integer.parseInt(bill);
        a+=80;
        this.bill=Integer.toString(a);
    }

    public void addExtraToppings(){
        // your code goes here
        int a=Integer.parseInt(bill);
        if(isVeg) a+=70;
        else a+=120;
        this.bill=Integer.toString(a);
    }

    public void addTakeaway(){
        // your code goes here
        int a=Integer.parseInt(bill);
        a+=20;
        this.bill=Integer.toString(a);
    }

    public String getBill(){
        // your code goes here
        return this.bill;
    }
}
