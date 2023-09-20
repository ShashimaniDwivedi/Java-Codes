
interface Computer
{
     void compile();
}
class Desktop implements Computer{
    public void compile()
    {
        System.out.println("You got 5 Errors,Faster");
    }
}
class Laptop implements Computer{
    public void compile()
    {
        System.out.println("You got 5 Errors...");
    }
}
class Developer
{
   public void BuildApp(Computer c)
    {
        System.out.println("Building App");
        c.compile();
    }
}

public class practice {
    public static void main(String[] args) {
        Computer c=new Desktop();
        Developer d=new Developer();
        d.BuildApp(c);


    }
}
