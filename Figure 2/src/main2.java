public class main2 {

	public static void main(String[] args) {

		Driver human = new Human();
        Driver robot = new Robot();

        // Transport 1 → Composition: Combustion Engine
        Transport truck = new Transport("combustion", human);
        truck.deliver("Karachi", "Groceries");

        // Transport 2 → Composition: Electric Engine
        Transport drone = new Transport("electric", robot);
        drone.deliver("Lahore", "Documents");

        // Transport 3 → Aggregation: Same driver, different engine
        Transport taxi = new Transport("electric", human);
        taxi.deliver("Islamabad", "Passengers");
	}
}
