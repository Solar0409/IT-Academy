package org.example;

import static org.example.FoodType.MEAT;

//Рептилии
public abstract class Reptiles extends Animals {
    public Reptiles(int weight, double foodConsumption) {
        super(weight, foodConsumption, FoodType.MEAT);
    }
}
//Ящерицы
class Lizards extends Animals{
    public Lizards(int weight, double foodConsumption){
        super(weight,foodConsumption, MEAT);
    }
    @Override
    public void sleep(){
        System.out.println(" Lizard is sleeping");
    }
}
//Змеи
class Snakes extends Animals{
    Snakes(int weight, double foodConsumption) {
        super(weight, foodConsumption, MEAT);
    }
}
//Черепахи
class Turtles extends Animals{

    Turtles(int weight, double foodConsumption) {
        super(weight, foodConsumption, MEAT);
    }
}
