package person;

//Class Y
public class Employee extends Person{

    protected String workEmail;
    protected double salary;


    public Employee(String firstName, String lastName, String workEmail, double salary) {
        super(firstName, lastName);

        this.workEmail = workEmail;
        this.salary = salary;
    }

    public Employee(Person person) {
        super(person.firstName, person.lastName);
        this.workEmail = "";
        this.salary = 0;
    }

    public Employee(Person person, String workEmail, double salary) {
        super(person.firstName, person.lastName);
        this.workEmail = workEmail;
        this.salary = salary;
    }

    public String getWorkEmail() {
        return workEmail;
    }

    public double getSalary() {
        return salary;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return  "Employee: "+firstName + ", " + lastName + ", "+ workEmail+ ", "+salary;
    }
}
