public class stat2 {
    static int a,b;
    int m,n;
    static{
     a=10;
     b=20;
     System.out.println("Controll in static block");
    }
    //Initialization block
    {
        m=100;
        n=200;
        System.out.println("Controll in Non static block");
    }
    static void disp1(){
        System.out.println("Static method");
        System.out.println("Value of Static variable :"+a+" "+b);
    }
    void disp2(){
        System.out.println("Non Static method");
        System.out.println("Value of Non Static variable :"+m+" "+n);
    }
    public static void main(String[] args) {
        stat2.disp1();
        stat2 s=new stat2();
        s.disp2();
    }
}
