class Student {

    void display() {
        System.out.println("Hello Student");
    }
}

public class AnonymousObject {

    public static void main(String[] args) {

        // Anonymous object
        new Student().display();
    }
}