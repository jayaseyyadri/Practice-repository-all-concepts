package mart;

import java.util.ArrayList;
import java.util.List;

public class MartTest {
    public static void main(String[] args) {

        List<Products> shoppingCart = new ArrayList<>();//shopping cart
//
        Products cellPhone = new CellPhone(1, 22.22, 1, "Iphone");
        Products Laptop = new Laptop("windows10", 1120, 123.80, true);
        Person cashier = new Person("jaya", "seyyadri");

        shoppingCart.add(cellPhone);
        shoppingCart.add(Laptop);

        System.out.println(cashier.ringUpCustomer(shoppingCart));

    }
}