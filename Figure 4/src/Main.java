import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Order order1 = new Order(Arrays.asList("Laptop", "Mouse"), new Ground());
        System.out.println("GROUND SHIPPING:\n" + order1);

        System.out.println("-----------------------");

        order1.setShippingType(new Air());
        System.out.println("AIR SHIPPING:\n" + order1);
    }
}
