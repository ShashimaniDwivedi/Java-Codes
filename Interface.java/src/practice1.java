//inner class concept

class Aout
{
    void outer()
    {
        System.out.println("Inside outer class");
    }
     static class B
    {
        void inner()
        {
            System.out.println("Inside inner class");
        }
    }
}

public class practice1 {
    public static void main(String[] args) {
    Aout obj=new Aout();
    //Aout.B obj1=obj.new B();   //Making object for non static  inner class
        Aout.B obj1=new Aout.B();//For static class
    obj.outer();
    obj1.inner();
    }
}
