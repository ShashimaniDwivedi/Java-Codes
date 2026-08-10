/* @FunctionalInterface
interface A{
    void show();
}

public class Lambda {
    public static void main(String[] args) {
        // A obj=new A() {
        //     public void show(){
        //         System.out.println("in show");
        //     }
        // };
        // obj.show();

        //Lambda expression
        A obj=()->System.out.println("in show");
        obj.show();
    }
}
 */
//Lambda with return
@FunctionalInterface
interface A{
    int add(int i,int j);
}

public class Lambda {
    public static void main(String[] args) {
        // A obj=new A(){
        //     public int add(int i,int j){
        //         return i+j;
        //     }
        // };
        // int res=obj.add(5,6);
        // System.out.println(res);

        //Lambda expression with return 
        //no need to write explicit return
         A obj=(i,j)-> i+j;
        int res=obj.add(5,6);
        System.out.println(res);
        
    }
}
