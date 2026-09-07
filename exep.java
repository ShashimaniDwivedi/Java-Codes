class MyException extends Exception{
    public MyException(String str){
        super(str);
    }
}
public class Exep {
    public static void main(String[] args) {
        //System.in.read(); give ascii value
        try {
            int a = 10;
            int b = 0;

            if(b==0) throw new MyException("Custom Exception");
            int result = a / b;
            System.out.println(result);
        }
        catch(MyException e){
            System.out.println(e);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Program continues...");
    }
}