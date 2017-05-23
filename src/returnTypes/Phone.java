package returnTypes;

/**
 * Created by ronald on 07/01/17.
 */
public class Phone {

    double weight;

    void setWeight (double val){
        weight = val;
    }
    double getWeight(){
        return weight;
    }

    public static void main(String[] args) {

        Phone phone = new Phone();
        phone.setWeight(20.36);
        System.out.println(phone.getWeight());

        int newWeight = (int) phone.getWeight();
        System.out.println(newWeight);
    }
}
/**
 * Something to note! If a method is void (thus not returning anything) you can't reassign its value.
 * Try do this within the main method:
 *
 *      Phone phone = new Phone();
 *      int newWeight = (int) phone.setWeight(); <-- WON'T COMPILE!!!
 */
