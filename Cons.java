public class Cons {
    int age;String name, clg;
    Cons(){
        this(21,"Shashi","BHU");
        System.out.println("Default Constructor");
    }

    Cons(int age ,String name){
        this();
        this.age=age;
        this.name=name;
        System.out.println("Parametrize Constructor");

    }

    Cons(int age ,String name,String clg){
        this.age=age;
        this.name=name;
        this.clg=clg;
        System.out.println("Overloaded Constructor");

    }
    public void show(){
        System.out.println(age+" "+name+" "+clg);
    }

    public static void main(String[] args) {
        Cons c1=new Cons();
        c1.show();
        Cons c2=new Cons(18,"Manas");
        c2.show();
        Cons c3=new Cons(18,"Manas","BHU");
        c3.show();
    }
    
}
