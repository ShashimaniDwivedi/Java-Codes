public class Main {
    static int age;
    static{
        age=18;
        System.out.println("Static block");
    }
    static void disp()
    {
        System.out.println("Static method jab hum call karege");
    }
    public static void main(String[] args) {
        System.out.println("Main method");
        disp();//object independent it is in same class that's why we call it directly
    }
}