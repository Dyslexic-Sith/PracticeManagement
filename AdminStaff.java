import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    List<Doctor> doctorList = new ArrayList<>();

    void addDoctor(Doctor o)
    {
        doctorList.add(o);
    }

    List<Patient> patientList = new ArrayList<>();

    void addPatient(Patient o)
    {
        patientList.add(o);
    }

    public List showDoctors()
    {
        System.out.println(doctorList.toString());
        return doctorList;
    }


    public List showPatients()
    {
        System.out.println(patientList.toString());
        return patientList;
    }

    public void assignDoctor(Patient pat, Doctor doc)
    {
        doc.patients.add(pat);
        pat.dr = doc.name;
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
 class test {
    public static void main(String[] args) {
        AdminStaff me = new AdminStaff("Sam","123456");
        System.out.println(me.toDo("Doctor"));
        Doctor her = new Doctor("Jessica", "260388");
        her.speciality = her.Speciality[0];
        Doctor him = new Doctor("Patrick", "111111");
        him.speciality = him.Speciality[2];
        System.out.println(her.toString());
        me.addDoctor(her);
        me.addDoctor(him);
        me.addDoctor(new Doctor ("Peter", "99999"));
        me.showDoctors();
        Patient pat = new Patient("Barry","123", 42, "male", "Diabetes");

    }
}