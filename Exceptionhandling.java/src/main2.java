//Custom Exception //raising own exception
class MyException extends Exception
{
    public MyException(){}
    public MyException(String msg) {
        super(msg);
    }
}

class Demo1 {
    public void a() throws Exception {
        b();
    }

    public void b() throws Exception {
        int num1 = 8;
        int num2 = -2;
        try {
            if (num2 < 0) {
                Exception e=new MyException("Negative number");
                    throw e;
            } else {
                int result = num1 / num2;
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println("Enter valid choice" +e);
        }
    }
}

public class main2 {
    public static void main(String[] args) {
        Demo1 obj = new Demo1();
        try {
            obj.a();
        } catch (Exception e) {
            System.out.println("error" + e);
        }
    }
}


