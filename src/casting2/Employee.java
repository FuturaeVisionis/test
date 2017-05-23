package casting2;

/**
 * Created by ronald on 02/11/16.
 */
public class Employee {

    interface Interviewer {
        void conductInterview();
    }

    public class Apprentice {
        public void learning() {
            System.out.println("Apprentice - learning");

            Teamleader beta = new Teamleader();
            beta.leading();

        }
        public class Teamleader{
            public void leading(){
                System.out.println("Team leader is leading.");
            }
        }
    }
}

