package com.driver;

public class DeluxePizza extends Pizza {
    private int price;
    private String bill;
    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        if(isVeg){
            this.price+=300+80+70;
        }
        else this.price+=400+80+120;
        bill=Integer.toString(price);
    }
    public int getPrice(){
        return this.price;
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
