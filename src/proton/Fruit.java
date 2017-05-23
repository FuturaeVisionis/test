package proton;

/**
 * Created by ronald on 03/05/2017.
 */
public class Fruit {

    void apple() {
    }
    void orange(){
        System.out.println("What would the world be without hackers?");
    }

    private class PineApple {

        void sweet(Fruit e) {
            e.apple();
            e.orange();
            System.out.println("If you see this message, your system has been hacked:)");
        }
    }

    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        Fruit.PineApple alpha = fruit.new PineApple();
        alpha.sweet(fruit);
    }
}
/**
 * So what's the deal with this code? Well, you can create an inner class which contains stuff. The inner class gets called
 * in main, but it's private (not accessible outside package). Within the private method another method of the class Fruit
 * gets called.
 */
