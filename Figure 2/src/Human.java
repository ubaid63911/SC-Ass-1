
public class Human implements Driver{

	@Override
    public void navigate(String destination) {
        System.out.println("Human driver is manually driving to " + destination + ".");
    }
}
