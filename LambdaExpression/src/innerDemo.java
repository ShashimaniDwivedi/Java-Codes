//Inner class type=member,Anonymous,Static
class A {
    public void show() {
        System.out.println("In show");
    }

  //   static class B
     class B
    {
        public void Display() {
            System.out.println("In display");
        }
    }
}
public class innerDemo {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
         A.B obj1=obj.new B();
       // A.B obj1 = new A.B();//for static we directly use A.B Refrence
        obj1.Display();
    }
}
