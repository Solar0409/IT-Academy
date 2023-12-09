import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Deal {
    private List<Product> products;
    private Date deadlineDate;

    public Deal() {
        this.products = new ArrayList<>();
        // Set the default deadline to today + 10 days
        this.deadlineDate = new Date(System.currentTimeMillis() + 10 * 24 * 60 * 60 * 1000);
    }

    // Add a product to the deal
    public void addProduct(Product product) {
        products.add(product);
    }

    // Remove a product from the deal by name
    public void removeProduct(String productName) {
        products.removeIf(product -> product.getName().equals(productName));
    }

    // Calculate the total price of the deal
    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.calculatePriceWithDiscount();
        }
        return totalPrice;
    }

    // Getter and setter methods for deadlineDate
    public Date getDeadlineDate() {
        return deadlineDate;
    }
}