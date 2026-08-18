import java.util.*;
import java.util.function.*;

public class Stream3 {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(10, 15, 20, 25, 30);

        // =====================================================
        // 1. FILTER
        // =====================================================

        // Using Anonymous Class
        Predicate<Integer> evenCheck = new Predicate<Integer>() {

            @Override
            public boolean test(Integer n) {
                return n % 2 == 0;
            }
        };

        // Using Lambda
        Predicate<Integer> evenCheckLambda =
                n -> n % 2 == 0;


        // =====================================================
        // 2. MAP
        // =====================================================

        // Using Anonymous Class
        Function<Integer, Integer> multiply = new Function<Integer, Integer>() {

            @Override
            public Integer apply(Integer n) {
                return n * 2;
            }
        };

        // Using Lambda
        Function<Integer, Integer> multiplyLambda =
                n -> n * 2;


        // =====================================================
        // 3. REDUCE
        // =====================================================

        // Using Anonymous Class
        BinaryOperator<Integer> addition =
                new BinaryOperator<Integer>() {

                    @Override
                    public Integer apply(Integer a, Integer b) {
                        return a + b;
                    }
                };

        // Using Lambda
        BinaryOperator<Integer> additionLambda =
                (a, b) -> a + b;


        // =====================================================
        // STREAM USING ANONYMOUS CLASS IMPLEMENTATIONS
        // =====================================================

        int result1 = nums.stream()
                .filter(evenCheck)       // Predicate
                .map(multiply)           // Function
                .reduce(0, addition);    // BinaryOperator

        System.out.println("Using Anonymous Class: " + result1);


        // =====================================================
        // STREAM USING LAMBDA EXPRESSIONS
        // =====================================================

        int result2 = nums.stream()
                .filter(evenCheckLambda)       // Lambda
                .map(multiplyLambda)           // Lambda
                .reduce(0, additionLambda);    // Lambda

        System.out.println("Using Lambda: " + result2);


        // =====================================================
        // DIRECT LAMBDA VERSION
        // =====================================================

        int result3 = nums.stream()

                // Keep only even numbers
                .filter(n -> n % 2 == 0)

                // Multiply every number by 2
                .map(n -> n * 2)

                // Add all numbers
                .reduce(0, (a, b) -> a + b);

        System.out.println("Direct Lambda: " + result3);
    }
}