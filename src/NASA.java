/**
 * Created by ronald on 25/09/16.
 */
public class NASA {

    public static void countdown(int n) {
        if (n == 0) {
            System.out.println("Game Over. You have been terminated!!");
        } else {
            System.out.println(n);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            countdown(n - 1);

        }
    }

    public static void main(String[] args) {
        System.out.println("Your have 5 seconds to get out of here. They start now:");
        countdown(5);
    }
}

