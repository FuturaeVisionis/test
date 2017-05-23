package objectLifeCycle;

/**
 * Created by ronald on 07/01/17.
 */
public class PrimeTime {
    String name;


    @Override
    public String toString() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
        System.out.println(toString());
    }

    public void myMethod() {

        int result = 8;

        if (result > 78) {
            PrimeTime primeTime = new PrimeTime();
            primeTime.setName("Android");

        } else {
            PrimeTime primeTime = new PrimeTime();
            primeTime.setName("Apple");
        }
    }

    public static void main(String[] args) {
        PrimeTime primeTime = new PrimeTime();
        primeTime.myMethod();

        primeTime = null;

        primeTime = new PrimeTime();
        primeTime.setName("Ronald");
        primeTime.toString();
    }
}
/**
 * An object is marked as eligible to be garbage collected when it can no longer be accessed, which can happen when the
 * object goes out of scope (see example above). It can also happen when the object's reference variable is assigned an
 * explicit null value.
 *
 * The garbage collector is a low priority thread that marks the object eligible for garbage collection in the JVM and then
 * clears the memory of these objects. You can determine only which objects are eligible to be garbage collected. You can
 * never determine when a particular object will be garbage collected.
 */
