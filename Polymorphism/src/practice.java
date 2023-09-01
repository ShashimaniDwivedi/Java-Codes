
class car
{
    public void verna()
    {
        System.out.println("Verna max speed is 120km/h");
    }
    public void Mustang()
    {
        System.out.println("Mustang max speed is 150km/h");
    }
}
class Audi extends car
{
    public void verna()
    {
        System.out.println("Verna max speed is 135km/h");
    }
    public void Mustang()
    {
        System.out.println("Mustang max speed is 175km/h");
    }
}
class Bmw extends car{
    public void verna()
    {
        System.out.println("Verna max speed is 150km/h");
    }
    public void Mustang()
    {
        System.out.println("Mustang max speed is 200km/h");
    }
}
class Vehical
{
    public void disp(car ref)
    {
        ref.verna();
        ref.Mustang();
        System.out.println("--------------------");
    }
}
public class practice {
    public static void main(String[] args) {
        car c=new car();
        Audi a=new Audi();
        Bmw b=new Bmw();
        Vehical v=new Vehical();
        v.disp(c);
        v.disp(a);
        v.disp(b);

    }
}
