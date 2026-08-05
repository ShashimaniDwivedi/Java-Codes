public class stat1 {
    static void disp(){
        System.out.println("Static method");
    }
    void disp2(){
        System.out.println("Non Static Method");
    }
    public static void main(String[] args) {
        stat1.disp();
        stat1 s=new stat1();
        s.disp();
        s.disp2();
    }
}
