package mart;

import java.util.ArrayList;

public class Person {
    private String firstName;
    private String lastName;
    private ArrayList<String> products =new ArrayList<>();


    //constructor
    public Person(String firstName, String lastName, ArrayList<String> products) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.products = products;
    }


//getters & setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<String> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<String> products) {
        this.products = products;
    }




}
//
//     person class with properties of
//     first name and last name.
//
//     T method that gives them the ability to ring up a cart or products
//        jupiter mart carries computers and cell phones.
//        These products should all have product ids and prices
//        cell phones should have properties for OS and screen size
//        computers should have properties for whether it is a laptop or not (boolean) and OS
//
//        add a class to hold your main method.
//        in your main method create products (computers and phones) for a customer to purchase
//        in your main method create a data structure of your choice called shoppingCart.  Add the products you have created.
//        create a cashier to work in Jupiter Mart
//        this cashier should ring up the products in shoppingCart