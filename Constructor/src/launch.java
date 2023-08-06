public class launch {
    private int a;
    private int b;
    public launch()
    {
        System.out.println("zero parametrised");
    }
    public launch(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void disp()
    {
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
    launch l=new launch();
    l.disp();
    launch l1=new launch(10,20);
    l1.disp();
    }
}
