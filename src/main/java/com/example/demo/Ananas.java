package com.example.demo;



public  class Ananas extends SandwichDecorator {

    public Ananas(Sandwich sandwich) {
        super(sandwich);
    }

    public double getPrix() {
        return sandwich.getPrix() + 0.5;
    }

    public String getDescription() {
        return sandwich.getDescription() + " + Ananas";
    }
}