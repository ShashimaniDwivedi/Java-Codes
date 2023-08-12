package Static;

import java.util.Scanner;

class Farmer
{
    int pa;
    float time;
     static float ri;
     static
     {
     ri=8.5f;
     }
    float si;
    void input(){

    Scanner scan=new Scanner(System.in);//input from user
    System.out.println("Please mention the amount required ");
    pa=scan.nextInt();
    System.out.println("Please mention the Time required ");
    time=scan.nextInt();
    //ri=8.5f;
}
void compute()
{
    si=(pa*ri*time)/100f;
}
void disp()
 {
    System.out.println("Si is :"+si);
 }

}
public class LaunchFarmer
{
    public static void main(String[] args)
    {
     Farmer f1=new Farmer();
     f1.input();
     f1.compute();
     f1.disp();
        Farmer f2=new Farmer();
        f2.input();
        f2.compute();
        f2.disp();
    }
}
