public class StaticBlockExample {

    static int num;

    // Static block
    static {
        System.out.println("Static block executed");
        num = 100;
    }
    StaticBlockExample(){
        System.out.println("Inside Constructor");
    }
//After class load static executed then constructor
    public static void main(String[] args) {
        StaticBlockExample s=new StaticBlockExample();
        System.out.println("Main method executed");
        System.out.println("num = " + num);
    }
}