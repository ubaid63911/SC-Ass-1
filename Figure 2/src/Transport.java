
public class Transport {

	    // Composition (engine owned by Transport)
	    private Engine engine;
	    // Aggregation (driver passed from outside)
	    private Driver driver;

	    // Constructor allows selecting engine type
	    public Transport(String engineType, Driver driver) {
	        this.driver = driver;

	        if (engineType.equalsIgnoreCase("electric")) {
	            this.engine = new ElectricEngine();
	        } else {
	            this.engine = new CombustionEngine();
	        }
	    }

	    public void deliver(String destination, String cargo) {
	        System.out.println("Starting delivery of " + cargo + " to " + destination + "...");
	        engine.move();
	        driver.navigate(destination);
	        System.out.println("Delivery of " + cargo + " completed.\n");
	    }
	}

