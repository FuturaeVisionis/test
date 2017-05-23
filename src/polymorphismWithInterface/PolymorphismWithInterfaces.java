package polymorphismWithInterface;

/**
 * Created by ronald on 02/11/16.
 */
public class PolymorphismWithInterfaces {
    public static void main(String[] args) {

        MobileAppExpert mobileAppExpert = new Programmer();
        MobileAppExpert mobileAppExpert1 = new Manager();

        mobileAppExpert.deliverMobileApp();

        mobileAppExpert1.deliverMobileApp();
        ((Employee) mobileAppExpert1).age(55); // This is down casting!!

        // Please take note that in this particular example the interface does not contain the "age" method.
        // But how can I now reach the "age" method? Well, the only way is through "down" casting!

        /**
        Casting is the process of forcefully making a variable behave as a variable of another type.
         */

    }
}
