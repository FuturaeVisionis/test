package toString;

/**
 * Created by ronald on 09/10/16.
 */
public class Apricot {

    private String name;
    private int number;

    public Apricot(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String toString() {
        return "Strawberries are more healthy than " + number + " " + name;
    }

    //public String Guava(String name, int number) {
        //System.out.println("Strawberries are more healthy than " + number + " " + name + ".");
        //return name + number;
    //}
}
