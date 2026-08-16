public class OperatorsExample {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // =================================
        // 1. ARITHMETIC OPERATORS
        // =================================

        System.out.println("=== Arithmetic Operators ===");

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));


        // =================================
        // 2. RELATIONAL OPERATORS
        // =================================

        System.out.println("\n=== Relational Operators ===");

        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));


        // =================================
        // 3. LOGICAL OPERATORS
        // =================================

        System.out.println("\n=== Logical Operators ===");

        boolean x = true;
        boolean y = false;

        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x     : " + (!x));


        // =================================
        // 4. ASSIGNMENT OPERATORS
        // =================================

        System.out.println("\n=== Assignment Operators ===");

        int c = 10;

        System.out.println("c = " + c);

        c += 5;
        System.out.println("c += 5 : " + c);

        c -= 3;
        System.out.println("c -= 3 : " + c);

        c *= 2;
        System.out.println("c *= 2 : " + c);

        c /= 4;
        System.out.println("c /= 4 : " + c);

        c %= 3;
        System.out.println("c %= 3 : " + c);


        // =================================
        // 5. INCREMENT / DECREMENT
        // =================================

        System.out.println("\n=== Increment / Decrement ===");

        int n = 5;

        System.out.println("n = " + n);

        System.out.println("n++ = " + n++);
        System.out.println("After n++ = " + n);

        System.out.println("++n = " + (++n));

        System.out.println("n-- = " + n--);
        System.out.println("After n-- = " + n);

        System.out.println("--n = " + (--n));


        // =================================
        // 6. BITWISE OPERATORS
        // =================================

        System.out.println("\n=== Bitwise Operators ===");

        int p = 5;   // 0101
        int q = 3;   // 0011

        System.out.println("p & q = " + (p & q));
        System.out.println("p | q = " + (p | q));
        System.out.println("p ^ q = " + (p ^ q));
        System.out.println("~p    = " + (~p));

        System.out.println("p << 1 = " + (p << 1));
        //signed right shift left side filled with sign bit
        System.out.println("p >> 1 = " + (p >> 1));
        //unsigned right shift left side filled with 0
        System.out.println("p >>> 1 = " + (p >>> 1));


        // =================================
        // 7. TERNARY OPERATOR
        // =================================

        System.out.println("\n=== Ternary Operator ===");

        int age = 20;

        String result = (age >= 18) ? "Adult" : "Minor";

        System.out.println(result);
    }
}