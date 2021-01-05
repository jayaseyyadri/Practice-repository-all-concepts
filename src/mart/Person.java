package mart;

import java.util.ArrayList;
import java.util.List;

public class Person {


    private String firstName;
    private String lastName;


    //constructor
    public Person(String firstName, String lastName1) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    //add shoppingCarts & return
    public double ringUpCustomer(List<Products> shoppingCart){
        double totalItems=0.0;
        //looping through list of shoppingCart objects
          for(Products product : shoppingCart){
              totalItems+=product.getPrice();
          }
          return totalItems;
    }

}
