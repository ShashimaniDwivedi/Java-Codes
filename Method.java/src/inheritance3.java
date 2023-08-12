class Animal
{
    public void eat()
    {
        System.out.println("Animal eat everyday");

    }

}
class Tiger extends Animal
{
    public void eat()
    {
        System.out.println("Tiger hunts and eat");

    }

}

public class inheritance3
{
    public static void main(String[] args) {
    Tiger t=new Tiger();
    t.eat();
    }
}
