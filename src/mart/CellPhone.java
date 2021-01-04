package mart;

public class CellPhone extends Products{

    private String operatingSystem;
    private int screenSize;

    //constructor
    public CellPhone(int productID, double price, int quantity, String name) {
        super(productID, price, quantity, name);
    }

    //getters & setters
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }



}
