public class Student {
    private String name;
    private int age;
    private String address;

    public Student() {
        this.name = "unknown";
        this.age = 0;
        this.address = "not available";
    }

    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setInfo(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public static void main(String[] args) {
        // Create an array to store 10 students
        Student[] students = new Student[10];

        // Populate the array of students
        for (int i = 0; i < students.length; i++) {
            Student student = new Student();
            student.setInfo("Student" + (i + 1), (i + 1) * 5, "Address" + (i + 1));
            students[i] = student;
        }

        // Print the details of 10 students
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + " - Name: " + students[i].getName() +
                    ", Age: " + students[i].getAge() + ", Address: " + students[i].getAddress());
        }
    }
}
