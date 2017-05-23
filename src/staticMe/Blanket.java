package staticMe;

import java.util.Random;
import Application.*;

/**
 * Created by ronald on 28/12/16.
 */
public class Blanket {

    static final int NUMBER = 2;

    static int Recurse() {

        Random random = new Random();
        System.out.println("Recurring");
        int babylon = random.nextInt(6);

        if (babylon == NUMBER) {
            System.out.println("Got it!");
        }else{
            Recurse();
        }
        return NUMBER;
    }

    public static void main(String[] args) {
        Recurse();
    }
}

