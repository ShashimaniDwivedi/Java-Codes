class A{
    
    public void show(){
        System.out.println("in show");
    }


    class B{
        public void config(){
            System.out.println("in config");
        }
    }
}


public class Inner {
    public static void main(String[] args) {
        A obj=new A();
        obj.show();
        A.B x=obj.new B();
        x.config();
    }
}
