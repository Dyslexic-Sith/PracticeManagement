import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Sam on 18/10/2016.
 */
public class AdminStaff extends Employee
{
    AdminStaff(String name, String ssn)
    {
        this.name = name;
        this.ssn = ssn;
    }

    static List<Doctor> doctorList = new ArrayList<>();


    static void addDoctor()
    {
        Doctor o = new Doctor();
        doctorList.add(o);
    }

    public static List<Patient> patientList = new ArrayList<>();

    static void addNewPatient()
    {
        Patient o = new Patient();
        patientList.add(o);
    }

    public static List showDoctors()
    {
        System.out.println(doctorList.toString());
        return doctorList;
    }


    public static List showPatients()
    {
        System.out.println(patientList.toString());
        return patientList;
    }

    public static void showDocAndPatients()
    {
        int docLength = doctorList.size();
        int i;
        for (i = 0; i < docLength; i++)
        {
            Doctor temp = doctorList.get(i);
            System.out.println(temp.getName());
            System.out.println(temp.patients);
            System.out.println();
        }
    }

    public static void assignDoctor()
    {
        int patLength = patientList.size();
        int docLength = doctorList.size();

        Scanner scan = new Scanner(System.in);
        System.out.println("Please select the doctor you would like to assign.");
        int i;
        for (i = 0; i < docLength; i++)
        {
            System.out.println("Press " + i + " for " + doctorList.get(i).name);
        }
        int doctorAssign = scan.nextInt();
        Doctor temp = doctorList.get(doctorAssign);

        System.out.println("Please select the patient you would like to assign to doctor " + temp.name);
        int j;
        for (j = 0; j < patLength; j++)
        {
            System.out.println("Press " + j + " for " + patientList.get(j).name);
        }
        int patientAssign;
        patientAssign = scan.nextInt();

        Patient temp1 = patientList.get(patientAssign);
        temp.patients.add(temp1);
    }

    public double weeklyPay()
    {
        double paySlip = 40*25;
        return paySlip;
    }

    @Override
    public String toDo(String a)
    {

        return "I am a " + a;
    }
}
