package display;

import container.Container;
import person.Employee;
import person.Person;
import person.ContractEmployee;

public class Display {

    //Displays attributes of class Person (Class X)
    public void showDataPerson(Container<Person> container) {
        container.print();
    }

    //Displays attributes of class Employee (Class Y)
    public void showDataEmployee(Container<Employee> container) {
        container.print();
    }

    //Displays attributes of class ContractEmployee (Class Z)
    public void showDataContractEmployee(Container<ContractEmployee> container) {
        container.print();
    }
}
