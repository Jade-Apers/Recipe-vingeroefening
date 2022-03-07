package com.example.myapplication;

public class Person {

    int amount;
    int ingredient;
    int amountCount;

    public int getAmount() {
        return amount;
    }
    public int getIngredient(){
        return ingredient;
    }

    public int getAmountCount(){
        return amountCount;
    }

    public void setAmount(int amount, int ingredient, int amountCount) {
        this.amount = amount;
        this.ingredient = ingredient;
    }

    public int amountCount(int amount, int ingredient) {
        return amount * ingredient;
    }
}


