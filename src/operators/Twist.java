package operators;

/**
 * Created by ronald on 01/01/17.
 */
public class Twist {

    public static void main(String[] args) {

        int a = 10;
        a = ++a + a + --a - --a + a++;
        System.out.println(a);

    }
    /**
     * What's going on here, Hoss?
     *
     * step1: a = 10 but increments immediately with 1 making it 11
     * step2: a = 11 no change
     * step3: a = It decrements immediately with 1 making it 10 again
     * step4: a = It decrements immediately making it 9
     * step5: a = 9, but the next a get 1 added.
     * Total = 11 + 11 + 10 - 9 + 9 = 32
     */
}
