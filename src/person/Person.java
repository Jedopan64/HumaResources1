package person;

//Class X
public class Person {

    protected String firstName;
    protected String lastName;

    public Person() {
        this.firstName = "";
        this.lastName = "";
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return  "Person: "+firstName + ", " + lastName;
    }
}
