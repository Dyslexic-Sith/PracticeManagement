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

        System.out.println("What would you like to do now? Please select from the following.");
        System.out.println("Press 'P' to add a patient.");
        System.out.println("Press 'D' to add a doctor.");
        System.out.println("Press 'S' to show doctors.");
        System.out.println("Press 'A' to assign a doctor to a patient.");
        System.out.println("Press 'R' to show doctors and their patient lists.");

        again= true;
        while (again)
        {
            again= false;
            int test = br.read();
            Doctor addDoc;
            String addPatient;
            //For case 'a'/'A'
            switch (test){
                case 97:
                case 65:
                    AdminStaff.assignDoctor();
                    break;
                //For case 'p'/'P'
                case 112:
                case 80:
                    System.out.println("You have selected to add a patient.");
                    AdminStaff.addNewPatient();
                    break;
                //For case 's'/'S'
                case 115:
                case 83:
                    System.out.println("Here are the doctors.");
                    AdminStaff.showDoctors();
                    break;
                //For case 'r'/'R'
                case 114:
                case 82:
                    System.out.println("Here are the doctors and the patients lists.");
                    AdminStaff.showDocAndPatients();
                    break;
                case 100:
                case 68:
                    AdminStaff.addDoctor();
                default:
                    again = true;
                    System.out.println("Please enter one of the following. Press 'P' to add a patient. Press 'D' to add a doctor. Press 'S' to show doctors. Press 'A' to assign a doctor to a patient. Press 'R' to show the doctors and their patients.");
                    break;
            }
        }
    }
}
