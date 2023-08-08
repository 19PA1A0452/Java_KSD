package FirstDayJavaHandson;

public class person {
    private String name;
    private int age;
	public person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	void person_info() {
		System.out.print(name+" ");
		System.out.println(age);
	}
	public static void main(String[] args) {
	person p = new person("Shyam",12);
	person p1 = new person("Chandu",32);
	person p2 = new person("Kethu",22);
	p.person_info();
	p1.person_info();
	p2.person_info();
	}
	
}
