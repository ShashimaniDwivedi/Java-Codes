
interface A{
    void show();
}
public class Lambda1{
    public static void main(String[] args) {
        //Anonymous class
        // A obj=new A(){
        //     public void show(){
        //         System.out.println("Anonymous class");
        //     }
        // };
        // obj.show();

        A obj=()->System.out.println("Anonymous Class");
        obj.show();

    }
}
