package polymorphismWithClasses;
import static java.lang.System.out;

/**
 * Created by ronald on 02/11/16.
 */
public class Manager extends Employee {

    @Override
    public void startProjectWork() {
        meetingWithCustomer();
        defineProjectSchedule();
        assignRespToTeam();
    }
    public void meetingWithCustomer(){
        out.println("meet Customer");
    }
    public void defineProjectSchedule(){
        out.println("Project Schedule");
    }
    public void assignRespToTeam(){
        out.println("team work starts");
    }

    }


