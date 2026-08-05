
@FunctionalInterface
interface clac {
    void disp();
}

public class practice
{
    public static  void main(String[] args) {
        /*clac c=new clac(){
            public void disp()
            {
                System.out.println("Hello");
            }
        };
        c.disp();*/
        clac c = () -> System.out.println("Hello");
        c.disp();
    }
}
