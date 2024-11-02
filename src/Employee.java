public class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary)
    {
        if(firstName == null || lastName == null)
            throw new IllegalArgumentException("First name and last name cannot be empty!");
        else
        {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        if(salary < 0)
            throw new IllegalArgumentException("Salary cannot be 0 or negative!");
        else
            this.salary = salary;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public void raiseSalary(double percentage)
    {
        if(percentage <= 0)
            throw new IllegalArgumentException("Raise cannot be 0 or negative!");
        this.salary += salary * (percentage / 100);
    }
}
