package org.example;

 class Animals {
    int weight;
    int quantityOfFoodPerDay;
    private FoodType foodtype;
    double foodConsumption;

    public String name;
    public String getName(){
        return name;
    }
    public Animals (String name, FoodType meat){
        this.name = name;
    }

     public Animals(int weight, int quantityOfFoodPerDay,
                    String foodType, double foodConsumption, String name) {
         this.weight = weight;
         this.quantityOfFoodPerDay = quantityOfFoodPerDay;
         this.foodtype = FoodType.valueOf(foodType);
         this.foodConsumption = foodConsumption;
         this.name = name;
     }

     public Animals(int weight, double foodConsumption, FoodType meat) {
        super();
    }
    public double getFoodConsumption(String foodType) {
        return 0;
    }
    public double getWeight() {
        return 0;
    }

    public Object getFoodType() {
        return null;
    }
    public void sleep(){
        System.out.println("Animals are asleep");
    }

    public double getFoodConsumption() {
        return 0;
    }
     public void calculateFoodConsumption(FoodType foodType) {
         calculateFoodConsumption(null);
     }
}
