class Person {
    private String firstName;
    private String lastName;

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
}

class Employee extends Person {
    private int employeeId;
    private String jobTitle;

    public Employee(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getLastName() {
        return super.getLastName() + " (" + jobTitle + ")";
    }
}

public class Main2 {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe");
        Employee employee = new Employee("Jane", "Smith", 12345, "Software Engineer");

        System.out.println("Person: " + person.getFirstName() + " " + person.getLastName());
        System.out.println("Employee: " + employee.getFirstName() + " " + employee.getLastName() + " (ID: " + employee.getEmployeeId() + ")");
    }
}
