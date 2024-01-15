public class Main {
    public static void main(String[] args) {
        Customer customer = Customer.initializeCustomer();
        double finalPrice = Shop.calculateFinalPrice(customer);
        System.out.println("Финальная цена покупки: "+ finalPrice);
        System.out.println();
    }
}