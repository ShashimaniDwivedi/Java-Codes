
class gun {
    void disp() {
        System.out.println("Kalasnikavo");
    }
   static class c {
        void show() {
            System.out.println("Inner class");
        }
    }
}



public class Demo {
    public static void main(String[] args) {
        gun g=new gun();
        g.disp();
        //new gun().disp();//Anonymous object
        gun.c obj=new gun .c();
        obj.show();
       // obj.disp();

    }
}
