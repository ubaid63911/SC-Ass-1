import java.util.*;

public class GameDevCompany extends Company{

	 @Override
	    protected List<Employee> getEmployees() {
	        return Arrays.asList(new Designer(), new Artist());
	    }
}
