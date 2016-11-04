/**
 * Created by Sam on 18/10/2016.
 */
abstract class Employee implements Person {
    public String name;
    public String ssn;

    public Employee(String name, String ssn)
    {
        this.name = name;
        this.ssn = ssn;
    }

    public Employee(){};
    @Override
    public String getName()
    {
        return name;
    }

    public final String getSSN()
    {
        return ssn;
    }
    public abstract String toDo(String a);

    @Override
    public String toString()
    {
        return "This employees name is " + name + " and their ssn is " + ssn;
    }

    public abstract double weeklyPay();
}
