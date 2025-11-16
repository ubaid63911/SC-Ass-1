public class main3 {

	public static void main(String[] args) {

		Company gameDev = new GameDevCompany();
        Company outsourcing = new OutSourcingCompany();

        System.out.println("=== Game Development Company ===");
        gameDev.createSoftware();

        System.out.println("=== Outsourcing Company ===");
        outsourcing.createSoftware();
	}
}