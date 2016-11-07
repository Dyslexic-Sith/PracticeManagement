import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by samuel.coianiz1 on 7/11/2016.
 */
public class Login {
    static final JDialog dialog = new JDialog();
    static String username;
    static String password;
    static int age;
    static String adminName;
    static String adminPassword;
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) throws IOException{
        System.out.println("Welcome to Practice Management Software.");
        System.out.println("Please enter your name.");
        username = reader.next();
        System.out.println("Please enter your age.");
        age = reader.nextInt();
        //System.out.println(username + " " + age);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean again= true;
        boolean verify = true;
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
            authenticate();
        }
    public static void authenticate() throws IOException
    {
            System.out.println("Please enter your username.");
            adminName = reader.next();
            System.out.println("Please enter your password.");
            adminPassword = reader.next();
            if (adminName.equals(username))
            {
                if (adminPassword.equals(password))
                {
                    Demo.main(adminName);
                }
                else
                {
                    System.out.println("That password is not correct.");
                    authenticate();
                }
            }
            else
            {
                System.out.println("That username is not correct.");
                authenticate();
            }
        }
    }


