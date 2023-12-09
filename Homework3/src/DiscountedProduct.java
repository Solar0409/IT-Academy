public class DiscountedProduct extends Product {
    private double discount;

    public DiscountedProduct(String name, double price, int quantity, double discount) {
        super(name, price, quantity);
        this.discount = discount;
    }

    @Override
    public double calculatePriceWithDiscount() {
        return getPrice() * getQuantity() * (1 - discount);
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double d) {
        this.discount = d;
    }
}