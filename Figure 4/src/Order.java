import java.util.List;

public class Order {

    private List<String> lineItems; 
    private Shipping shipping;

    public Order(List<String> lineItems, Shipping shipping) {
        this.lineItems = lineItems;
        this.shipping = shipping;
    }

	public double getTotal() {
        return 120.0;
    }

    public double getTotalWeight() {
        return 8.0;
    }

    public void setShippingType(Shipping shipping) {
        this.shipping = shipping;
    }

    public Shipping getShippingType() {
        return shipping;
    }

    public double getCost() {
        return shipping.getCost(this);
    }

    public String getDate() {
        return shipping.getDate(this);
    }

    @Override
    public String toString() {
        return "Order total: $" + getTotal() +
                "\nShipping Cost: $" + getCost() +
                "\nDelivery Date: " + getDate();
    }
}
