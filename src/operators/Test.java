package operators;

/**
 * Created by ronald on 05/01/17.
 */
public class Test {

    int phoneNumber = 123456789;

    void setNumber(){
        int phoneNumber= 987654321;
    }
}
class Testphone {
    public static void main(String[] args) {
        Test test = new Test();
        test.setNumber();
        System.out.println(test.phoneNumber);


}}
