package casting2;

/**
 * Created by ronald on 02/11/16.
 */
public class HRExecutive extends Employee implements Employee.Interviewer {
    @Override
    public void conductInterview() {
        System.out.println("HRExecutive - conducting interview");

        Apprentice apprentice = new Apprentice();
        apprentice.learning();

    }
}

