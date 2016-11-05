import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Sam on 18/10/2016.
 */
public class Doctor extends Employee
{
    public static String speciality;
    public static String[] Speciality = {"ENT", "HeartSpecialist", "Eye"};
    private static int specLength = Speciality.length;
    Doctor()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the doctor's name.");
        this.name = scan.next();
        System.out.println("Please enter the doctor's ssn.");
        this.ssn = scan.next();
        System.out.println("Please select from the following specialities.");
        int i;
        for (i = 0; i < specLength; i++)
        {
            System.out.println("Press " + i + " for " + Speciality[i]);
        }
        int spec;
        spec = scan.nextInt();
        this.speciality = Speciality[spec];

    }
    public double weeklyPay()
    {
        double payslip = 40*50;
        return payslip;
    }

    static public List<Patient> patients = new ArrayList<>();

    @Override
    public String toDo(String a)
    {
        return "I am a " + a;
    }


    public String getSpeciality()
    {
        return speciality;
    }

    @Override
    public String toString()
    {
        return super.toString() + " and their speciality is " + speciality;

    }
}
