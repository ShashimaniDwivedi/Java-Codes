
interface a
{
  void show();
   default void config()
  {
   System.out.println("in config");
  }
    static void abc()
    {
        System.out.println("in abc");
    }

}
 class b implements a
{
    public void show()
    {
        System.out.println("in show");
    }
    //we can override default method
  /*  public void config()
    {
        System.out.println("===");
    }*/
     void abc()
    {
        System.out.println("----");
    }


}

public class Java8Fe {
    /*Error: Unable to initialize main class Java8fe
Caused by: java.lang.NoClassDefFoundError: A (wrong name: a)*/
    public static void main(String[] args) {
    a.abc();//static method we can call directly by interface name
    b obj=new b();
    obj.show();//calling abstract method of interface from b class
    obj.config();//calling default method using obj because cannot call non-static member in static context
    obj.abc();
    }
}
