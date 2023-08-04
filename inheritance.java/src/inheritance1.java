
class Demo1//Multilevel inheritance
{
  void disp()
  {
      System.out.println("Display method written in demo1 class");
  }
}
class Demo2 extends Demo1 {
    void print() {
        System.out.println("Display method written in demo2 class");
    }
}
class Demo3 extends Demo2
{

}
public class inheritance1 {
    public static void main(String[] args) {
      Demo3 d=new Demo3();
      d.disp();
      d.print();
    }
}
