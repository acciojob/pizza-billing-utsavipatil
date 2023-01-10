package com.driver;

public class Pizza {

    private int price; //Calculating final bill price
    private Boolean isVeg;
    private String bill;
    private int cheesePrice, toppingsPrice , takeAwayPrice;
    private boolean isCheeseAdded , isTakeAwayAdded , isToppingsAdded, isBillGenerated;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.cheesePrice = 80;
        this.takeAwayPrice = 20;

        if(isVeg){
            this.price = 300;
            this.toppingsPrice = 70;
        }else{
            this.price = 400;
            this.toppingsPrice = 120;
        }
        this.isTakeAwayAdded = false;
        this.isToppingsAdded = false;
        this.isCheeseAdded = false;
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isCheeseAdded){ //Extra Cheese Add only once
            this.price = this.price + this.cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!isToppingsAdded){ //Extra Toppings Add only once
            this.price = this.price + this.toppingsPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(!isTakeAwayAdded){
            this.price = this.price + this.takeAwayPrice;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        if(!isBillGenerated){ //Bill generate single time
            if(isCheeseAdded){
                this.bill = this.bill + "Extra Cheese Added: " + this.cheesePrice + "\n";
            }
            if(isToppingsAdded){
                this.bill = this.bill + "Extra Toppings Added: " + this.toppingsPrice + "\n";
            }
            if(isTakeAwayAdded){
                this.bill = this.bill + "Paperbag Added: " + this.takeAwayPrice + "\n";
            }
            this.bill = this.bill + "Total Price: " + this.price + "\n";

            isBillGenerated = true;
        }
        return this.bill;
    }
}
