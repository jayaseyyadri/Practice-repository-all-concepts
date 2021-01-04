package mart;

import java.util.ArrayList;

public class Person {

    private Object Products;// should be an object or an array list?

    private String firstName;
    private String lastName;


    //constructor
    public Person(String firstName, String lastName, Object products1) {
        this.firstName = firstName;
        this.lastName = lastName;
        Products = products1;
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

}
