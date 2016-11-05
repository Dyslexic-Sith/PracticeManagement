import java.util.Scanner;

/**
 * Created by Sam on 18/10/2016.
 */
public class Patient extends Employee
{
    private int patientAge;
    private String patientGender;
    private String disease = "";
    public String name;
    Patient()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter patient's name.");
        this.name = scan.next();
        System.out.println("Please enter patient's ssn.");
        this.ssn = scan.next();
        System.out.println("Please enter patient's age.");
        this.patientAge = scan.nextInt();
        System.out.println("Please enter patient's gender.");
        this.patientGender = scan.next();
        System.out.println("Please enter patient's disease.");
        this.disease = scan.nextLine();
    }

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
