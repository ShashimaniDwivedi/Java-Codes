class Student {

    String name;
    int rollNo;
    int age;

    // 1. No-argument constructor
    Student() {
        System.out.println("Default Constructor");
        name = "Unknown";
        rollNo = 0;
        age = 0;
    }

    // 2. One-parameter constructor
    Student(String name) {
        System.out.println("Parametrize Constructor");
        this.name = name;
        rollNo = 0;
        age = 0;
    }

    // 3. Parameterized constructor
    Student(String name, int rollNo, int age) {
        System.out.println("Parametrize Constructor");
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    // Display method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Age: " + age);
        System.out.println();
    }
}

public class ConstructorExample {

    public static void main(String[] args) {

        // Calling no-argument constructor
        Student s1 = new Student();
        s1.display();

        // Calling one-parameter constructor
        Student s2 = new Student("Manas");
        s2.display();

        // Calling parameterized constructor
        Student s3 = new Student("Shashi", 11, 21);
        s3.display();

    }
}