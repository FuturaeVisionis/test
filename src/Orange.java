/**
 * Created by ronald on 02/10/16.
 */
public class Orange {

    static String y = "MyGame";


    public static void MyGame() {

        String u = "MyGame";

        if (u.equals(y)) {
            YourGame();
        } else {
            System.out.println("Game Over");
        }
    }

    static void YourGame() {
        System.out.println("Enter your secret code:");

    }

    public static void main(String[] args) {
        //Orange orange = new Orange();
        MyGame();

    }
}
