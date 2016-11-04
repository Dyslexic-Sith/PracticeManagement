import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sam on 18/10/2016.
 */
public class Doctor extends Employee
{
String speciality;
    Doctor(String name, String ssn)
    {
        this.name = name;
        this.ssn = ssn;
    }
    public double weeklyPay()
    {
        double payslip = 40*50;
        return payslip;
    }

    public List<Patient> patients = new ArrayList<>();

    @Override
    public String toDo(String a)
    {
        return "I am a " + a;
    }

    public String[] Speciality = {"ENT", "HeartSpecialist", "Eye"};

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
