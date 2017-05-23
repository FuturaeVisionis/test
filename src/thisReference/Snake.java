package thisReference;

/**
 * Created by ronald on 26/12/16.
 */
public class Snake extends Kangaroo {

    String name = "Zizzle";

    void bushAnimal() {
        System.out.println(this.name);
        System.out.println(super.name);
    }
}

