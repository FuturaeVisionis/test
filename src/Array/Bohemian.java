package Array;

/**
 * Created by ronald on 16/10/16.
 */
public class Bohemian {
    public static void main(String[] args) {

        int[] index = new int[4];
        index[0] = 1;
        index[1] = 2;
        index[2] = 0;
        index[3] = 2;

        String[] islands = new String[4];
        islands[0] = "Bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cozumel";

        int y = 0;

        while (y < 4) {
            System.out.println("Islands = " + islands[y]);
            y++;

        }
        return;
    }
}
