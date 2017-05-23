/**
 * Created by ronald on 25/09/16.
 */
public class PrintTwice {

    public PrintTwice(String s) {
        System.out.println(s);
        System.out.println(s);
        return;

    }

    public static void main(String[] args) {

        new PrintTwice("Don't make me say this twice");

    }
}
