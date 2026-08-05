class Aeroplane {
    public void takeoff() {
        System.out.println("Aeroplane is taking off");//overridden method
    }

    public void fly() {//Inherited method
        System.out.println("Aeroplane is Flying");
    }

}

class cargoPlane extends Aeroplane {
    public void takeoff() {
        System.out.println("Aeroplane is Landing");//overriding method
    }
}

class passengerPlane extends Aeroplane {
    public void takeoff() {
        System.out.println("Aeroplane is boarding");
    }
}
class AirPort
{
    public void poly(Aeroplane ref)
    {
        ref.takeoff();
        ref.fly();
        System.out.println("******************************");
    }
}


public class Launchpoly {
    public static void main(String[] args)
    {
        cargoPlane c = new cargoPlane();
        passengerPlane p=new passengerPlane();

        AirPort a=new AirPort();
        a.poly(c);
        a.poly(p);





    }


}

