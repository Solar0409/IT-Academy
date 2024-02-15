package org.example;

//млекопитающие
public  class Mammals extends Animals {
     Mammals(int weight, String name) {
         super(name, FoodType.MEAT);
    }

    public static void main(String[] args) {
        Mammals lion = new Mammals(50, "Liopold");
        Mammals Tyger = new Mammals(80, "Mladshiy");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Mammals are sleeping");
    }
}
//Хищники
class Predators extends Animals {
    public Predators(String name, FoodType meat) {
        super(name, meat);
    }
}
//Травоядные
class Herbivores extends Animals {
    public Herbivores() {
        super(weight, foodConsumption, FoodType.MEAT);
    }
}

//Всеядные
class Omnivores extends Animals {
    public Omnivores(String name, FoodType meat) {
        super(name, meat);
    }
}

