package com.example.demo;


public class Fromage extends SandwichDecorator {

    public Fromage(Sandwich sandwich) {
        super(sandwich);
    }

    public double getPrix() {
        return sandwich.getPrix() + 1.0;
    }

    public String getDescription() {
        return sandwich.getDescription() + " + Fromage";
    }
}