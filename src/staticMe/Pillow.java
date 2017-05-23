package staticMe;

import java.util.Scanner;

/**
 * Created by ronald on 28/12/16.
 */
public class Pillow {

    int NUMBER = 5;

    int Recurse() {

        int NUMBER = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hit me with a number: ");
        int babylon = scanner.nextInt();

        //this.NUMBER = NUMBER;

        if (babylon == this.NUMBER) {

            System.out.println("Got it");
        }else{
            Recurse();
        }
        return 0;
    }

    public static void main(String[] args) {
        Pillow pillow = new Pillow();
        pillow.Recurse();
    }
}
