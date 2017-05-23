package staticMe;

import java.util.Scanner;

/**
 * Created by ronald on 27/12/16.
 */
public class Chopper {

    static int wheels = landinggear();

    public String lastName = parentSurname();

    public String parentSurname() {
        return "Van Gogh";
    }

    String name = parentName(); // <-- the String of type name is equaled to (return type) method parentName

    public String parentName() {
        if (wheels < 3 && wheels > 0)
            return "Hello world";
        else return parentSurname();
    }

    private static int landinggear() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int babe = scanner.nextInt();
        return babe;
    }

    public static void main(String[] args) {

        Chopper chopper = new Chopper();
        System.out.println(chopper.wheels);


        //System.out.println(chopper.name);
        //System.out.println(chopper.lastName);
    }
}

/**
 * See it like this. You have a static house with a static owner AND you have a Non-Static house with a Non-Static owner.
 * The Non-Static owner can enter the static house and the Non-Static house has it' doors closed for the static owner BUT
 * the static house has it's doors open for the non-static owner and the static owner can't enter the non static house.
 */
