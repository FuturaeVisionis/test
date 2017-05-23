package polymorphismWithInterface;

/**
 * Created by ronald on 02/11/16.
 */
public class Programmer extends Employee implements MobileAppExpert {
    @Override
    public void deliverMobileApp() {
        System.out.println("testing complete on real device.");

    }
}
