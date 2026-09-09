class Parent {

    void show() {
        System.out.println("Parent show() method");
    }
}

class Child extends Parent {

    void show() {
        System.out.println("Child show() method");
    }

    void display() {
        // Calling current class method using this
        this.show();

        // Calling parent class method using super
        super.show();
    }
}

public class Main1 {
    public static void main(String[] args) {

        Child obj = new Child();

        obj.display();
    }
}