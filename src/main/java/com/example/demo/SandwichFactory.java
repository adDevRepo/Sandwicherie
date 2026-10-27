package com.example.demo;

public class SandwichFactory {
    public static Sandwich creerSandwich() {
        return new SandwichJambonBeurre();
    }
}
