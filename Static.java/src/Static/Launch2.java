package Static;
class Demo
{
     void disp1()
    {
        System.out.println("Static disp1");
    }
    static void disp2()
    {
        System.out.println("Static disp2");
    }

}
public class Launch2 {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.disp1();
        Demo.disp2();//object independent
    }
}
