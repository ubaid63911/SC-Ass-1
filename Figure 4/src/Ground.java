
public class Ground implements Shipping{

	@Override
    public double getCost(Order order) {
        // Free ground delivery on big orders
        if (order.getTotal() > 100) {
            return 0;
        }

        // $1.5 per kilogram, but $10 minimum
        return Math.max(10, order.getTotalWeight() * 1.5);
    }

    @Override
    public String getDate(Order order) {
        // Simulate estimated delivery date
        return "5-7 business days";
    }
}
