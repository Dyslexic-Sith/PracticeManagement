/**
 * Created by Sam on 21/10/2016.
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JDialog;

public class Demo {
    static final JDialog dialog = new JDialog();
    static String username;
    static String password;
    static int age;
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Practice Management Software.");
        System.out.println("Please enter your name.");
        username = reader.next();
        System.out.println("Please enter your age.");
        age = reader.nextInt();
        //System.out.println(username + " " + age);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean again= true;
        while (again)
        {
            again= false;
            System.out.println("Please tell me if you're an Admin or a User. Press A for Admin, and U for user.");
            int test = br.read();
            switch (test){
                case 97:
                case 65:
                    username = "IamAdmin" + username;
                    password = "Admin!Don'tMess" + age;
                    break;
                case 117:
                case 85:
                    username = username + "IamUser!";
                    password = "UserOnly" + age;
                    break;
                default:
                    again = true;
                    break;
            }
        }
        //dialog.setAlwaysOnTop(true);
        JOptionPane.showMessageDialog(dialog, "Your username is " + username + " and your password is " + password);
        dialog.dispose();
        
    }
}
