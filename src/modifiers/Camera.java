package modifiers;

/**
 * Created by ronald on 09/10/16.
 */
public class Camera {

    static public void main(String[] args) {

        modifiers.Device device = new modifiers.Device();
        device.setName(device.getName());
        System.out.println("The best video recorder ever "+ device.getName());

    }
}
/*
Encapsulation:

The whole idea behind encapsulation is to hide the implementation details from users.
If a data member is private, it means it can only be accessed within the same class.
No outside class can access private data member (variable) of other classes. However,
if we set up public getter and setter methods to update and read the private data
fields then the outside class can access those private data fields via public methods.
This way data can only be accessed by public methods thus making the private fields and
their implementations hidden for outside classes. That’s why encapsulation is also known
as data hiding.

 */