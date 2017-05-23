package operators;

/**
 * Created by ronald on 01/01/17.
 */
public class Planets {
    public static void main(String[] args) {

        int a = 10;
        a = a++ + a + a-- - a-- + ++a;
        System.out.println(a);
    }
    /**
     * What's going on here, Hoss?
     *
     * step1: a = 10 and stays 10 but adds 1 at next a
     * step2: a = 11 (this is next a, therefore 10 + 1
     * step3: a = 11 stays but subtracts 1 at next a
     * step4: a = 10 next 'a' and subtracts 1 at next a
     * step5: a = 9, but immediately adds 1 (++is postfix) making it 10
     * Total = 10 + 11 + 11 - 10 + 10 = 32
     */
}
