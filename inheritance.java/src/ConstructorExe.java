
class Demo
{
    int a, b;

    public Demo()
    {
        System.out.println("Parent class Constructor");
    }
    public Demo(int x, int y)
    {
        System.out.println("parameterized Parent  class Constructor");
        a=x;
        b=y;
    }
}
class Demo4 extends Demo
{
    int m,n;
    public Demo4()
    {
       // super();
        //super(10,20);
        this(10,20);
        System.out.println("Child class Constructor");
    }

    public Demo4(int x, int y)
    {
        //super();
        System.out.println("parameterized child class Constructor");
        m=x;
        n=y;
    }
}
public class ConstructorExe
{
    public static void main(String[] args)
    {

        Demo4 d=new Demo4();

        //Demo4 d2=new Demo4(10,20);
    }

}