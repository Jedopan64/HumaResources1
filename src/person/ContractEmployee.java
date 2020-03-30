package person;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

//Class Z
public class ContractEmployee extends Employee{

    private Date contractStartDate;
    private Date contractEndDate;

    public ContractEmployee(String firstName, String lastName, String workEmail, double salary, Date contractStartDate, Date contractEndDate) {
        super(firstName, lastName, workEmail, salary);

        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
    }

    public ContractEmployee(Employee employee) {
        super(employee.firstName, employee.lastName, employee.workEmail, employee.salary);
        this.contractStartDate = null;
        this.contractEndDate = null;
    }

    public ContractEmployee(Employee employee, Date contractStartDate, Date contractEndDate) {
        super(employee.firstName, employee.lastName, employee.workEmail, employee.salary);
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
    }

    public Date getContractStartDate() {
        return contractStartDate;
    }

    public Date getContractEndDate() {
        return contractEndDate;
    }

    public void setContractStartDate(Date contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public void setContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        return  "ContractEmployee: "+firstName + ", " + lastName + ", "+ workEmail+ ", "+salary+", "+dateFormat.format(contractStartDate)+", "+dateFormat.format(contractEndDate);
    }
}
