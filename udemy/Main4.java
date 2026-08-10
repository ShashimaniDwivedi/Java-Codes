class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

interface Walkable {

    void walk();
}

interface Swimmable {

    void swim();
}

class Dog extends Animal implements Walkable, Swimmable {

    public void walk() {
        System.out.println("Dog is walking");
    }

    public void swim() {
        System.out.println("Dog is swimming");
    }
}

public class Main4 {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();       // From Animal
        d.walk();      // From Walkable
        d.swim();      // From Swimmable
    }
}