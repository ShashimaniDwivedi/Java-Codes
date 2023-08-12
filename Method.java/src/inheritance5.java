
class Aeroplane {
    public void takeoff() {
        System.out.println("Aeroplane is taking off");//overridden method
    }

    public void fly() {
        System.out.println("Aeroplane is Flying");
    }

}

class cargoPlane extends Aeroplane {
    public void takeoff() {
        System.out.println("Aeroplane is Landing");//overriding method
    }
    public void carryGoods()
    {

        System.out.println("cargoPlane carry Goods");
    }
}

class passengerPlane extends Aeroplane {
    public void takeoff() {
        System.out.println("Aeroplane is boarding");
    }
}


public class inheritance5 {
    public static void main(String[] args)
    {
        cargoPlane c = new cargoPlane();
        c.takeoff();


    }


}
