class Human{
    private String name;
    int age;
    Human(){
        System.out.println("Human Class Constructor");
    }
    void sleep(){
        age=21;
        System.out.println("Human need Good Sleep");
    }

}
class Student extends Human{
    //default
    // Student(){
    //     super();
    // }

    void disp(){
        System.out.printf("The age is %d\n ",+age);
    }
}


public class Inheritance1 {
    public static void main(String[] args) {
        Student obj=new Student();
        obj.sleep();
        obj.disp();
    }
    
}
