package polymorphismWithInterface;

/**
 * Created by ronald on 02/11/16.
 */
public class Manager extends Employee implements MobileAppExpert {
    @Override
    public void deliverMobileApp() {
        System.out.println("QA complete");
        System.out.println("code delivered with release notes");

    }

    @Override
    public int age(int birthday) {
        System.out.println("I am legend " + birthday);
        return birthday;
    }
}
