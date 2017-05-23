package Array;

/*
This examples was taken from the book Headfirst JAVA page 100/101.
It actually explains encapsulation. The instance variable size is private.
The only way to use it, is through getters and setters. The nice thing about this
little programme is that it shows the Animal array in which the Animals are set to
sizes and later these are called upon.
 */

/**
 * Created by ronald on 16/10/16.
 */
public class Animal {

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void bark() {
        if (size > 60) {
            System.out.println("Wooof, Wooff!");
        } else if (size > 14) {
            System.out.println("Ruff, Ruff");
        } else {
            System.out.println("Yip, Yip!");
        }
    }


    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.setSize(70);

        Animal animal1 = new Animal();
        animal1.setSize(8);
        System.out.println("Animal one " + animal.getSize());
        System.out.println("Animal two " + animal.getSize());

        animal.bark();
        animal1.bark();


        Animal[] animal3 = new Animal[7];
        animal3[0] = new Animal();
        animal3[1] = new Animal();

        animal3[0].setSize(30);
        int x = animal3[0].getSize();
        animal3[1].setSize(77);
        int y = animal3[1].getSize();

        System.out.println("Animal three " + x);
        System.out.println("Animal four " + y);

        animal3[0].bark();
    }

}
