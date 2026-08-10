public class Hello{
    public static void main(String[] args) {
        System.out.println("Hello World");
        //Range -2^n to 2^n-1 where n is bit
        // 1. byte
        byte age = 20;

        // 2. short
        short salary = 30000;

        // 3. int
        int population = 1000000;
         //by default java consider (long as int) and (float as double) so we add f and L as suffix
        // 4. long
        long distance = 9876543210L;

        // 5. float
        float price = 99.99f;

        // 6. double
        double pi = 3.14159265359;

        // 7. char for we use single quote
        char grade = 'A';

        // 8. boolean
        boolean isJavaEasy = true;


        // Printing all values
        System.out.println("byte  1 byte  : " + age);
        System.out.println("short 2 byte  : " + salary);
        System.out.println("int   4 byte  : " + population);
        System.out.println("long  8 byte  : " + distance);
        System.out.println("float 4 byte  : " + price);
        System.out.println("double 8 byte : " + pi);
        System.out.println("char  2 byte  : " + grade);
        System.out.println("boolean : " + isJavaEasy);
        //Type Casting
        int a=258;
        byte k=(byte)a;
        //258%256(range)
        System.out.println(k);

    }
}
