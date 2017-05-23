package casting2;

/**
 * Created by ronald on 02/11/16.
 */
public class Department {
    public static void main(String[] args) {

        Employee.Interviewer interviewer = new HRExecutive();
        interviewer.conductInterview();

        Employee.Interviewer interviewer1 = new Manager();
        interviewer1.conductInterview();

        Employee employee = new Employee();
        Employee.Apprentice delta = employee.new Apprentice() {
        };
        delta.learning(); // reaching within the innerclass!

    }
}
