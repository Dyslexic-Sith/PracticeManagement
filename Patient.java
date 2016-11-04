/**
 * Created by Sam on 18/10/2016.
 */
public class Patient extends Employee
{
    private int patientAge;
    private String patientGender;
    private String disease;
    public String dr;

    Patient(String name, String ssn, int age, String gender, String disease)
    {
        this.name = name;
        this.ssn = ssn;
        this.patientAge = age;
        this.patientGender = gender;
        this.disease = disease;
    }
    public String name;
    public String getName()
    {
        return this.name;
    }
    public String toDo(String a)
   {
       return "I am a " + a;
   }

   public double weeklyPay()
   {
       return 1.0d;
   }

   @Override
    public String toString()
   {
       return "The patient's name is " + name + ". They are a " + patientAge + " year old " + patientGender + ". They are seeing a doctor about " + disease;
   }
}
