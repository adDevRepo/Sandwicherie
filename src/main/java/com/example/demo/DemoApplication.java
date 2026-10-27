package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {


    public static void main(String[] args) {

      CommandeFacade commande = new CommandeFacade();

       Sandwich sandwich =  commande.creerSandwich(true, true);

        System.out.println("Vous avez choisi : " + sandwich.getDescription());
        System.out.println("Le prix est de : " + sandwich.getPrix() + " €");
    }
}