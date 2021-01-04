package mart;

public class Laptop extends Products{

   private String operatingSystem;
   private int screenSize;
   private double memory;
   private boolean isLaptop;

    //constructors
    public Laptop(String operatingSystem,int screenSize, double memory,  boolean isLaptop) {
        super(1,200.00,1,"Toshiba" );
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

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public boolean isLaptop() {
        return isLaptop;
    }

    public void setLaptop(boolean laptop) {
        isLaptop = laptop;
    }


}

