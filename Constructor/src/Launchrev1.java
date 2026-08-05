
class calculator
{
    int add(int x,int y)//in method defination value passed is known as parameter
    {
        return x+y;
    }
    float add(int x,float y)
    {
        return x+y;
    }
    int add(int x,int y,int z)
    {
        return x+y+z;
    }
    double add(int x,double y,double z)
    {
     return x+y+z;
    }
     double add(double x,double y,double z)
     {
         return  x+y+z;
     }
}


public class Launchrev1 {
    public static void main(String[] args)
    {
    calculator calc=new calculator();//its like polymorphisum but not an actual polymorphisum
    calc.add(10,20,30);//in method call value passed is known as argument
    calc.add(10,20);
    calc.add(10.5,5.5,3.4);
   // System.out.println(calc.add(10,20));

    }


}
