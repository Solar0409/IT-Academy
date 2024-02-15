package org.example;

import java.util.ArrayList;

import static org.example.FoodType.MEAT;


public class Main {
    public static void main(String[] args) {
        ArrayList<Animals> animals = new ArrayList<>();

        Animals lion1 = new Animals("Liopold", MEAT);
        lion1.getFoodConsumption("Meat");

        Animals elefant1 = new Animals("Barbara", MEAT);
        elefant1.getFoodConsumption("grass");
        {
        }
        ;

        Zoo wildLifePark = new Zoo("WildLifePark", 10);
        wildLifePark.addAnimal(lion1);
        wildLifePark.addAnimal(elefant1);
    }
}