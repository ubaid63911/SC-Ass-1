
public class Robot implements Driver{

	@Override
    public void navigate(String destination) {
        System.out.println("Robot is automatically navigating to " + destination + ".");
    }
}
