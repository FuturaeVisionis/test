

import javax.swing.JOptionPane;

/**
 * Created by ronald on 25/09/16.
 */
public class Authenticator {

    public static void main(String args[]) {


        String username = JOptionPane.showInputDialog("username:");
        String password = JOptionPane.showInputDialog("password:");
        if (
                username != null &&
                        password != null &&
                        (
                                (username.equals("knepperr") &&
                                        password.equals("Netbeans200!")) ||
                                        (username.equals("knepperr") &&
                                                password.equals("Varags200!"))


                        )) {
            JOptionPane.showMessageDialog
                    (null, "You are in");
        } else JOptionPane.showMessageDialog(null, "You are suspicious");
    }
}
