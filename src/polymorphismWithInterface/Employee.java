package polymorphismWithInterface;

/**
 * Created by ronald on 02/11/16.
 */
public class Employee {

    public int age(int birthday){
        System.out.println("Employees birthday is " + birthday);
        return birthday;
    }

}

/**
Now, you can also implement the interface MobileAppExpert at the Employee level. This is actually much better, because
the Manager and Programmer classes extend the Employee class.
 */