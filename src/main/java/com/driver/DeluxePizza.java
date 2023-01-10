package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg); //parent's constructor
        /*  All will work !!!

            Option 1 due to Mehtod overriding these mentods are not defined in child class so default it will find in parent class
            addExtraCheese();
            addExtraToppings();

            Option 2 call the local but mentod is not present in local it will automatically direct to find in parent
            this.addExtraCheese();
            this.addExtraToppings();

            Option 3 direclty calling parent
            super.addExtraCheese();
            super.addExtraToppings();

            Future option 1 & 2 should go because if we create local methods then thay will call first
        */

        addExtraCheese();
        addExtraToppings();
    }
}
