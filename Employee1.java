public class Employee1{
    private String name;
    private String jobTitle;
    private double salary;

    public Employee1(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void updateSalary(double newSalary) {
        if (newSalary >= 0) {
            salary = newSalary;
            System.out.println("Salary updated successfully.");
        } else {
            System.out.println("Invalid salary value.");
        }
    }

    public void calculateBonus(double percentage) {
        double bonusAmount = salary * (percentage / 100);
        salary += bonusAmount;
        System.out.println("Bonus applied. New salary: " + salary);
    }

    public static void main(String[] args) {
        Employee1 employee = new Employee1("John Doe", "Software Engineer", 60000);

        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Job Title: " + employee.getJobTitle());
        System.out.println("Salary: $" + employee.getSalary());

        employee.updateSalary(65000);
        employee.calculateBonus(10);
        System.out.println("Updated Salary: $" + employee.getSalary());
    }
}
