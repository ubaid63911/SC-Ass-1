import java.util.*;

public class OutSourcingCompany extends Company{

	
    protected List<Employee> getEmployees() {
        return Arrays.asList(new Programmer(), new Tester());
    }
}
