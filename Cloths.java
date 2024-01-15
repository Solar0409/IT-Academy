public abstract class Cloths {
    int size;
    double price;
    String color;

    public Cloths(int size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
