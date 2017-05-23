/**
 * Created by ronald on 25/09/16.
 */
public class PrintTime {

    public static void printTime(int hour, int minute) {
        System.out.print(hour);
        System.out.print(" : ");
        System.out.print(minute);
    }

    public static void main(String[] args) {
        int hour = 1;
        int minute = 59;
        printTime(hour +1, minute - 6);
    }
}
