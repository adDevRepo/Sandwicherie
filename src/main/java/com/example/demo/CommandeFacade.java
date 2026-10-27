package com.example.demo;

    public  class CommandeFacade {
        public Sandwich creerSandwich(boolean fromage, boolean ananas) {
            Sandwich sandwich = new SandwichJambonBeurre();

            if (fromage) {
                sandwich = new Fromage(sandwich);
            }

            if (ananas) {
                sandwich = new Ananas(sandwich);
            }

            return sandwich;
        }

}
