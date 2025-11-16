import java.util.*;

public abstract class Company {

	public void createSoftware() {
        List<Employee> employees = getEmployees();
        for (Employee e : employees) {
            e.doWork();
        }
        System.out.println("Software created successfully!\n");
    }

    // Abstract factory method
    protected abstract List<Employee> getEmployees();
}
