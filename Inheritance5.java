
class AeroPlane{
//Both are Inherited method because they are not modifyied in child class
  public void takeOff(){
   System.out.println("AeroPlane is taking off");
  }
  //overridden method
  
  public void fly(){
    System.out.println("AeroPlane is Flying");
  }
}

class PassengerPlane extends AeroPlane{
  public void carryPassenger(){
    System.out.println("Carrying Passenger");
  }
  //overriding method
  public void fly(){
    System.out.println("PassengerPlane is Flying");
  }
}

class CargoPlane extends AeroPlane{
    public void carryCargo(){
        System.out.println("Carrying Cargo");
    }
    //overriding method
    public void fly(){
    System.out.println("CargoPlane is Flying");
  }

}

public class Inheritance5 {
    public static void main(String[] args) {
        CargoPlane cp=new CargoPlane();
        cp.takeOff();
        cp.fly();
        PassengerPlane pp=new PassengerPlane();
        pp.takeOff();
        pp.fly();
    }
}
