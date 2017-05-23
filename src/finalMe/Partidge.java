package finalMe;

/**
 * Created by ronald on 25/12/16.
 */
public class Partidge {

    String A = "Apple";
    final static String COUNTABLE = "twelve";
    final String DISTANCE = "four hundred miles";


    public Partidge(){

        final StringBuilder par = new StringBuilder(A = "PineApple");
        par.append(" + Pie"); // <-- You are calling a method on it!!
        //par = new StringBuilder("Cherry"); // <-- attempting to change it, results in compilation error!
        System.out.println(par);
        System.out.println(A);

    }
    final public void geese(){
        System.out.println("Flocks of geese rarely exceed " + COUNTABLE + " birds.");
        System.out.println("These bird fly over " + DISTANCE);

    }

    public static void main(String[] args) {

        Partidge partidge = new Partidge();
        partidge.geese();

        System.out.println(partidge.COUNTABLE); // when COUNTABLE ain't static
        System.out.println(COUNTABLE); // when making COUNTABLE static

    }
}
