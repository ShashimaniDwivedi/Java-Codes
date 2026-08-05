
public class Student1 {
    private String name;
    private int age;
    public Student1()
    {   this("Rohit",19);
        System.out.println("Zero parametrized Constructor");
       // name="Rohan";
        //age=18;

    }
    public Student1(String name)
    {
        this();//call same class constructor
        this.name=name;
        age=19;
    }
    public Student1(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    void disp()
    {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Student1 c=new Student1();
        c.disp();
        Student1 c1=new Student1("Rahul");
        c1.disp();


    }
}

