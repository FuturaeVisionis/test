package mama;

/**
 * Created by ronald on 02/11/16.
 */
public class Child extends Parent {

    @Override
    public void teeth() {
        int tooth = 12;

        if (tooth > 10){
        //super.teeth();
        System.out.println("All children are borne with teeth");
    }
}}
