package polymorphismWithClasses;

/**
 * Created by ronald on 02/11/16.
 */
public class PolymorphismWithClasses {
    public static void main(String[] args) {
        Employee employee1 = new Programmer();
        Employee employee2 = new Manager();

        employee1.reachOffice();
        employee2.reachOffice();

        employee1.startProjectWork();
        employee2.startProjectWork();
    }
}
