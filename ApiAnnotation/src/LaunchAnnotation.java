@FunctionalInterface //it give error if we write two method
interface show{//Functional interface
    void disp();
//    void call();
    //with comment if we write two it doesn't give any error
        }
class plane
{
    public void planeFly()
    {
      System.out.println("Plane is flying");
    }
}

class cargoPlane extends plane
{
    @Override//Annotation
    public void planeFly()
    {
        System.out.println("cargo plane flying");
    }
}

public class LaunchAnnotation {
    public static void main(String[] args) {
    plane cp=new cargoPlane();
    cp.planeFly();
    }
}
