package BindingOfVariables;

/**
 * Created by ronald on 26/12/16.
 */
public class FruitBasket {
    public static void main(String[] args) {

        Orange orange = new Orange();
        System.out.println(orange.name);
        orange.printFruit();

        Orange banana = new Banana();
        System.out.println(banana.name);
        banana.printFruit();
    }
}
/**
 * Now what's the catch? You can use a reference variable of a base class to refer to an object of a derived class eg.
 *
 *                         Orange banana = new Banana();
 *                         System.out.println(banana.name);
 *
 *  but if the instance variables in both base and derived class have the same name, JAVA is going to use the first
 *  available variable instantiation. Now this can create a problem. HOw to bypass? Don't refer to a derived class!!
 */
