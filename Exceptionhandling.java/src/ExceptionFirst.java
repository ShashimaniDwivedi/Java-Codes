public class ExceptionFirst  {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 0;
        int result = 0;
        int values[] = {4, 5, 6, 7};
        String name = null;
        try {
            result = num1 / name.length();
            System.out.println(values[5]);
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Cannot divide by zero"+obj);
        }
        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("Stay in your limit"+obj);
        }
        catch(Exception obj)
        {
            System.out.println("Something went wrong..."+obj);//by writing +obj it gives exact exception type
        }

        System.out.println(result);
        System.out.println("Bye");
    }
}