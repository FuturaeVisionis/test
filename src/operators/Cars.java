package operators;

/**
 * Created by ronald on 01/01/17.
 */
public class Cars {
    public static void main(String[] args) {

        double d = 20.0; // step one: assign 20 to d
        double e = 10.0; // step two: assign 10 to e
        double f = d * e--; // take e which holds the value of 10 and change e to 9 (10-1)

        System.out.println(f); // answer should be 10 * 20
        System.out.println(e); // answer should be 9
    }
}
