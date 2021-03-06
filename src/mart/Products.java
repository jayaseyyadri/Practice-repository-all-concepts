package mart;

public class Products {

    private int productID;
    private double price;
    private int quantity;
    private String name;


    //Constructor
    public Products(int productID, double price, int quantity, String name) {
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
        this.name = name;
    }


    //getters & setters
    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

