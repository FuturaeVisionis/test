package operators;

/**
 * Created by ronald on 01/01/17.
 */
public class Colors {
    /**
     * Check this out!
     */
    public static void main(String[] args) {


        int a = 20; //  a = 20
        a++; // at next 'a', add 1

        int b = 10; // b = 10
        ++b; // immedi
        // ately add 1, making b 11 now

        int c = a - b++; //  next 'a' means add one to 'a', making a 21 and 21 at next a
                         //  b which is 11 , and becomes 12 at next b



        System.out.println(a); // next a = 21
        System.out.println(b); // next b = 12
        System.out.println(c); // 20 - 10 = 10


    int i1 = 10;
    int i2 = 20;

    boolean apa = (i1 >= i2);
        System.out.println(apa);

        char p = 10;
        char q = 20;

        System.out.println(p > q);

        System.out.println(apa != false);

        int n = 8;
        int e = 10;

        System.out.println(e++);

        System.out.println(e);

        String name = "hello";
        if (name != null && name.length() > 0) // true && true = true
            System.out.println(name.toUpperCase());

        boolean james = false;
        boolean rick = true;

        System.out.println(james!=rick && james==false);

        Integer d = 100;
        int dd = 10;
        System.out.println(d*dd);


}}
