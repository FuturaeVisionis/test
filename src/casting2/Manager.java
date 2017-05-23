package casting2;

/**
 * Created by ronald on 02/11/16.
 */
public class Manager implements Employee.Interviewer {
    @Override
    public void conductInterview() {
        System.out.println("Manager - conducting interview");
    }
}
