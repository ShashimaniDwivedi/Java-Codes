class Parent {

    Parent() {
        System.out.println("Parent default constructor");
    }

    Parent(int x) {
        this();
        System.out.println("Parent parameterized constructor: " + x);
    }
}

class Child extends Parent {

    Child() {
        super(10);   // calls Child(int)
        System.out.println("Child default constructor");
    }

    Child(int x) {
        this();    // calls Parent(int)
        System.out.println("Child parameterized constructor: " + x);
    }
}

public class Main2 {

    public static void main(String[] args) {

        Child obj = new Child(10);
    }
}