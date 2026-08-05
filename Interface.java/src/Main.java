
 interface  computer
{
    void compileCode();
}
class Laptop implements computer {
    public void compileCode() {
        System.out.println("You got 5 errors");
    }

}
class Desktop implements computer{
    public void compileCode() {
        System.out.println("You got 5 errors,faster");
    }

}

class Developer {
   // Laptop obj = new Laptop();
    public void buildApp(computer obj) {
        System.out.println("Building app");
        obj.compileCode();
    }
}

/*interface A
{
//  int num=1;
//  void show();//by default method is public and abstract

}*/

public class Main {
    public static void main(String[] args) {
        //System.out.println(A.num);
        //Laptop obj = new Laptop();
        computer obj=new Desktop();
        Developer dev = new Developer();
        dev.buildApp(obj);
    }
}