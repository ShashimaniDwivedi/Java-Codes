class Aeroplane1 {
    public void takeoff()
    {
        System.out.println("Aeroplane is taking off");//overridden method
    }

    public void fly()
    {
        System.out.println("Aeroplane is Flying");
    }

}

class cargoPlane1 extends Aeroplane1 {
    public void takeoff()
    {
        System.out.println("Aeroplane is Landing");//overriding method
    }

    public void fly()
    {
        System.out.println("Aeroplane Flies at lower height");
    }
}

class passengerPlane1 extends Aeroplane1 {
    public void takeoff()
    {
        System.out.println("Aeroplane is boarding");
    }
    public void fly()
    {

        System.out.println("Aeroplane Flies at medium height");
    }
}

class fighterPlane extends Aeroplane1
{
    public void takeoff()
    {
        System.out.println("fighterPlane required small size runway");
    }
    public void fly()
    {
        System.out.println("fighterPlane flies at high speed");
    }
}
class AirPort1
{
    public void poly(Aeroplane1 ref)
    {
        ref.takeoff();//polymorphism one is to many //Run time polymorphism
        ref.fly();
        System.out.println("*********************");
    }
}
public class Launchpoly1 {
    public static void main(String[] args)
    {
        cargoPlane1 c=new cargoPlane1();
        passengerPlane1 p=new passengerPlane1();
        fighterPlane f=new fighterPlane();
        //Passing References
        AirPort1 a=new AirPort1();
        a.poly(c);
        a.poly(p);
        a.poly(f);

    }


}

