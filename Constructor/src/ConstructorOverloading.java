public class ConstructorOverloading {
    private String name;
    private int age;
    public ConstructorOverloading()
    {
        System.out.println("Zero parametrized Constructor");
        name="Ram";
        age=21;

    }
    public ConstructorOverloading(String name)
    {
        this.name=name;
        age=17;
    }
    public ConstructorOverloading(String name,int age)
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
        ConstructorOverloading c=new ConstructorOverloading();
        c.disp();
        ConstructorOverloading c1=new ConstructorOverloading("Manas");
        c1.disp();
        ConstructorOverloading c2=new ConstructorOverloading("Manas",18);
        c2.disp();
    }
}
