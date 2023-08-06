
interface A
{
    void show();
}
interface X extends A
{
    void abc();
}
class B implements A,X //implementing multiple interface
{
   public void show()
    {
        System.out.println("In show");
    }

    public  void abc() {
      System.out.println("In abc");
    }
}

public class Demo {
    public static void main(String[] args) {
        B b=new B();
        b.show();
        b.abc();

    }
}
