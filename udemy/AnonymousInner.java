abstract class A{
    abstract void show();
}

public class AnonymousInner {
    public static void main(String[] args) {
        //Here we creating obj of anonymous inner class
        A obj=new A(){
          public void show(){
            System.out.println("Anonymous inner class");
          }
        };
        obj.show();
    }
}
