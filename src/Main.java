import container.Container;
import display.Display;
import person.ContractEmployee;
import person.Employee;
import person.Person;

import java.util.Date;

public class Main {

    public static void main(String args[]) {
        //Prepare data
        Display display = new Display();

        Container<Person> personContainer = new Container<>();
        Container<Employee> employeeContainer = new Container<>();
        Container<ContractEmployee> contractEmployeeContainer = new Container<>();

        Person p1 = new Person("Jan","Kowalski");
        Person p2 = new Person("Krystyna","Kowalska");

        Employee e1 = new Employee(p1,"jan@corp.pl",5500.32);
        Employee e2 = new Employee(p2,"krys@corp.pl",4500.32);

        ContractEmployee ce1 = new ContractEmployee(e1,new Date(119,3,1),new Date(120,5,6));
        ContractEmployee ce2 = new ContractEmployee(e2,new Date(119,8,23),new Date(120,7,22));

        personContainer.add(p1);
        personContainer.add(p2);

        employeeContainer.add(e1);
        employeeContainer.add(e2);

        contractEmployeeContainer.add(ce1);
        contractEmployeeContainer.add(ce2);


        //Display containers
        display.showDataPerson(personContainer);
        display.showDataEmployee(employeeContainer);
        display.showDataContractEmployee(contractEmployeeContainer);


    }
}
