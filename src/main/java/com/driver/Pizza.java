package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    boolean isextraTopping=false;
    boolean isextraCheese=false;
    boolean isPaperBag=false;
    int extraT=0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.bill="";
        if(isVeg){
            this.price=300;
            this.extraT=70;
        }
        else{
            this.price=400;
            this.extraT=120;
        }
        this.bill += "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isextraCheese) {
            isextraCheese = true;
            this.price += 80;
        }
    }

    public void addExtraToppings(){
        if(!isextraTopping){
            isextraTopping=true;
            this.price+=extraT;
        }
    }

    public void addTakeaway(){
        if(!isPaperBag){
            isPaperBag=true;
            this.price+=20;
        }
    }

    public String getBill(){
        // your code goes here
        if(isextraCheese) this.bill += "Extra Cheese Added: " + 80 + "\n";
        if(isextraTopping) this.bill += "Extra Toppings Added: " + extraT + "\n";
        if(isPaperBag) this.bill += "Paperbag Added: " + 20 + "\n";
        this.bill+="Total Price: " + this.price + "\n";
        return this.bill;
    }
}
