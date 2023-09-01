abstract class Aeroplane2 {
    abstract public void takeoff(); //{//child class modify it
    //System.out.println("Aeroplane is taking off");//overridden method
    //}

    abstract public void fly(); //{

    //System.out.println("Aeroplane is Flying");
    // }
    public void plane() {
        System.out.println("Plane is Hijacked");
    }

}

class cargoPlane2 extends Aeroplane2 {
    public void takeoff() {
        System.out.println("Aeroplane is Landing");//overriding method
    }

    public void fly() {

        System.out.println("cargoPlane flies at lower height");
    }

    public void Alert()//specialised method
    {
        System.out.println("Alert..");
    }
}

class passengerPlane2 extends Aeroplane2 {
    public void takeoff() {
        System.out.println("Aeroplane is boarding");
    }

    public void fly() {
        System.out.println("Aeroplane Flies at medium height");

    }

}

public class Launchabs {
    public static void main(String[] args) {
        Aeroplane2 ref1 = new cargoPlane2();
        ref1.takeoff();
        ref1.fly();
        ref1.plane();
        //Child type reference
        ((cargoPlane2) ref1).Alert();//specialised method

        Aeroplane2 ref3 = new passengerPlane2();
        ref3.takeoff();
        ref3.fly();
        ref3.plane();


    }

}

