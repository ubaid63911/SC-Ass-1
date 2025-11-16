public class Air implements Shipping {

    @Override
    public double getCost(Order order) {
        // $3 per kilogram
        return order.getTotalWeight() * 3.0;
    }

    @Override
    public String getDate(Order order) {
        // Simulate faster delivery
        return "1-2 business days";
    }
}
