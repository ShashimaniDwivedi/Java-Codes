import java.util.*;
import java.util.stream.*;

public class StreamExample {

    public static void main(String[] args) {

        // =====================================================
        // 1. CREATE A LIST
        // =====================================================

        List<Integer> numbers = Arrays.asList(
                10, 25, 30, 15, 40, 5, 50
        );


        // =====================================================
        // 2. WITHOUT STREAM API
        // =====================================================

        System.out.println("Without Stream:");

        for (Integer n : numbers) {

            // Select only numbers greater than 20
            if (n > 20) {

                // Print the number
                System.out.println(n);
            }
        }


        // =====================================================
        // 3. WITH STREAM API
        // =====================================================

        System.out.println("\nWith Stream:");

        numbers.stream()

                // filter() → selects elements
                // Only numbers greater than 20 will continue
                .filter(n -> n > 20)

                // sorted() → sorts the remaining elements
                .sorted()

                // forEach() → performs an action on each element
                .forEach(n -> System.out.println(n));
    }
}