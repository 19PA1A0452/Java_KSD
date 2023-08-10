class Use_Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Use_Member {
    String specialization;
}

class Manager extends Use_Member {
    String department;
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "John Doe";
        employee.age = 30;
        employee.phoneNumber = "123-456-7890";
        employee.address = "123 Main St, City";
        employee.salary = 50000.0;
        employee.specialization = "Software Development";

        Manager manager = new Manager();
        manager.name = "Jane Smith";
        manager.age = 40;
        manager.phoneNumber = "987-654-3210";
        manager.address = "456 Park Ave, Town";
        manager.salary = 80000.0;
        manager.department = "HR";

        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        System.out.println("Salary: " + employee.salary);
        System.out.println("Specialization: " + employee.specialization);

        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        System.out.println("Salary: " + manager.salary);
        System.out.println("Department: " + manager.department);
    }
}

