package mart;

public class Laptop extends Products{
   private String operatingSystem;
   private int screenSize;
   private double memory;
   private boolean isLaptop;

    public Laptop(String operatingSystem,int screenSize, double memory,  boolean isLaptop) {
        super(1,200.00,1,"Toshiba" );
    }
}

