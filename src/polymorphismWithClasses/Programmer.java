package polymorphismWithClasses;
import static java.lang.System.out;

/**
 * Created by ronald on 02/11/16.
 */
public class Programmer extends Employee {
    @Override
    public void startProjectWork() {
        defineClasses();
        unitTestCode();
    }
    private void defineClasses(){
        out.println("define classes");

    }
    private void unitTestCode(){
        out.println("unit test code");
    }
}
