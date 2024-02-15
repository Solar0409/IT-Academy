package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;

import static org.example.FoodType.*;

public class Zoo {
    private String name;
    private int capacity;
    private List<Animals> animals;

    public Zoo(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animals animal) {
        if (animals.size() < capacity) {
            animals.add(animal);
        } else {
            System.out.println("Zoo is already full. " +
                    "Cannot add more animals.");
        }
    }
     public void calculateFoodConsumption(FoodType foodType) {

        double totalConsumption = animals.stream()
                .filter(animal -> animal.getFoodType() == foodType)
                .mapToDouble(Animals::getFoodConsumption)
                .sum();
        System.out.println("Total food consumption for "
                + foodType + ": " + totalConsumption);


         //        double totalConsumption = 0;
//        for (Animals animal : animals) {
//            totalConsumption += animal.getFoodConsumption(foodType);
//        }
    }

    public double calculateTotalWeight() {

        double totalWeight = animals.stream()
                .mapToDouble(Animals::getWeight)
                .sum();
        return totalWeight;

        //        double totalWeight = 0;
//        for (Animals animal : animals) {
//            totalWeight += animal.getWeight();
//        }
        // System.out.println("Total weight of all animals: " + totalWeight);

    }

    public void countAnimalsByFoodType(FoodType foodType) {
        int meatCount = 0;
        int plantCount = 0;
        for (Animals animal : animals) {
            if (animal instanceof Mammals) {
                meatCount++;
            } else if (animal instanceof Herbivores) {
                plantCount++;
            }
        }
        System.out.println("Animal count by food type - Meat: " + meatCount + ", Plant: " + plantCount);
    }

    public void countAnimalsByType() {
        int mammalCount = 0;
        int birdCount = 0;
        int reptileCount = 0;
        for (Animals animal : animals) {
            if (animal instanceof Mammals) {
                mammalCount++;
            } else if (animal instanceof Birds) {
                birdCount++;
            } else if (animal instanceof Reptiles) {
                reptileCount++;
            }
        }
        System.out.println("Animal count by type - Mammal: " + mammalCount +
                ", Bird: " + birdCount + ", Reptile: " + reptileCount);
    }

    public void makeAnimalsSleep() {
        animals.forEach(Animals::sleep);
        System.out.println("All animals are now sleeping.");
    }

    public List<Animals> sortAnimalsByType() {
        return animals.stream()
                .sorted(Comparator.comparing(animal -> {
                    if (animal instanceof Mammals) {
                        return 1;
                    } else if (animal instanceof Birds) {
                        return 2;
                    } else if (animal instanceof Reptiles) {
                        return 3;
                    } else {
                        return 0;
                    }
                }))
                .collect(Collectors.toList());
    }

    public List<Animals> sortAnimalsByWeight() {
        return animals.stream()
                .sorted(Comparator.comparing(Animals::getWeight).reversed())
                .collect(Collectors.toList());
    }

    public List<Animals> findAnimalsByFoodTypeAndConsumption(String foodType, double minConsumption, double maxConsumption) {
        return animals.stream()
                .filter(animal -> animal.getFoodType().equals(foodType))
                .filter(animal -> animal.getFoodConsumption() >= minConsumption && animal.getFoodConsumption() <= maxConsumption)
                .collect(Collectors.toList());
    }

    private static class Carnivore {
    }

    private static class Herbivore {
    }

    private static class Mammal {
    }

    private static class Bird {
    }

    private static class Reptile {
    }
}
