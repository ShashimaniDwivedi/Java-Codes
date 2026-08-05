
class Animal  //Hierarchical inheritance
{
    void sleep()
{
    System.out.println("Animal needs sleep");
}

}
class Tiger extends Animal
{


}
class Monkey extends Animal
{


}
class Deer extends Animal
{


}
//***************Multiple inheritance Not Allowed**************
/*class Parent1 {
    int age = 19;
}
class Parent2 extends  Parent1 {
    int age = 18;
}
class child extends Parent1 ,Parent2//not allowed
{

}*/

public class Main {
    public static void main(String[] args) {
        Deer d=new Deer();
        d.sleep();
        //child c=new child();


    }
}