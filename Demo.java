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
    public static void main(String usersname) throws IOException {

        Doctor McDreamy = new Doctor("McDreamy", "123", "ENT");
        Doctor Howser = new Doctor("Doogie Howser", "1989", "HeartSpecialist");
        Patient Blob = new Patient("Fatty", "400kgs", 43, "Male", "Obesity");
        Patient Flyer = new Patient("Icarus", "11111", 125, "Male", "Flew too close to the sun");
        Howser.patients.add(Blob);
        McDreamy.patients.add(Flyer);

        System.out.println("Welcome " + usersname);
        boolean again= true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your ssn.");
        String usersSsn = reader.nextLine();
        AdminStaff Administrator = new AdminStaff(usersname,usersSsn);

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
            //For case 'a'/'A'
            switch (test){
                case 97:
                case 65:
                    Administrator.assignDoctor();
                    break;
                //For case 'p'/'P'
                case 112:
                case 80:
                    System.out.println("You have selected to add a patient.");
                    Administrator.addNewPatient();
                    break;
                //For case 's'/'S'
                case 115:
                case 83:
                    System.out.println("Here are the doctors.");
                    Administrator.showDoctors();
                    break;
                //For case 'r'/'R'
                case 114:
                case 82:
                    System.out.println("Here are the doctors and the patients lists.");
                    Administrator.showDocAndPatients();
                    break;
                case 100:
                case 68:
                    Administrator.addDoctor();
                default:
                    again = true;
                    System.out.println("Please enter one of the following. Press 'P' to add a patient. Press 'D' to add a doctor. Press 'S' to show doctors. Press 'A' to assign a doctor to a patient. Press 'R' to show the doctors and their patients.");
                    break;
            }
        }
    }
}
