public class Product {
    private final String name;
    private final double price;
    private final int quantity;
    public Product (String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }

    public double getTotalPrice (){
        return price * quantity;
    }

    @Override
    public String toString(){
        return String.format("%s: $%.2f x %d = $%.2f", name, price, quantity, getTotalPrice());

    }

    public double calculatePriceWithDiscount(){
        return getTotalPrice();
    }


}