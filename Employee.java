package FirstDayJavaHandson;
import java.util.*;
public class Employee {
	private String Name;
	private String JobTitle;
	private int Salary;
	public Employee(String name, String jobTitle, int salary) {
		super();
		Name = name;
		JobTitle = jobTitle;
		Salary = salary;
	}
	void printRecord() {
		System.out.println(Name);
		System.out.println(JobTitle);
		System.out.println(Salary);
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getJobTitle() {
		return JobTitle;
	}
	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	void caluculateSalary() {
		//------------------------------
	}
	void updateSalary(int a) {
		this.Salary = a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details one by one: ");
		System.out.println("Enter the name: ");
		String name = sc.next();
		System.out.println("Enter the role: ");
		String role = sc.next();
		System.out.println("Enter the salary: ");
		int salary = sc.nextInt();
		System.out.println("If you want to update the salary please type new slary here: ");
		int updatesalary = sc.nextInt();
		Employee e1 = new Employee(name,role,salary);
		e1.printRecord();	
		System.out.println("Details after updated the salary: ");
		e1.updateSalary(updatesalary);
		e1.printRecord();
}
}