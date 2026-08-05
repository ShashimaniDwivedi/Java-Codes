import java.util.Scanner;

class Farmer
{
    int pa;
    float td;
   static float rt;//sirf ek baar memory allocate hogi
    float si;

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please mention the amount required : ");
        pa=sc.nextInt();
        System.out.println("Please mention the time duration : ");
        td=sc.nextFloat();
        rt=8.5f;
    }
    void compute()
    {
        si=(pa*rt*td)/100;
    }
    void disp()
    {
        System.out.println("Simple interest is : "+si);
    }

}

public class LaunchFarmer {
    public static void main(String[] args) {
    Farmer f1=new Farmer();
    Farmer f2=new Farmer();
    f1.input();
    f1.compute();
    f1.disp();
    f2.input();
    f2.compute();
    f2.disp();
    }
}
