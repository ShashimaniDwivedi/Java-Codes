public class AllLoops {

    public static void main(String[] args) {

        // 1. FOR LOOP
        System.out.println("For Loop:");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }


        // 2. WHILE LOOP
        System.out.println("\nWhile Loop:");

        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }


        // 3. DO-WHILE LOOP
        System.out.println("\nDo-While Loop:");

        int j = 1;

        do {
            System.out.println(j);
            j++;
        } while (j <= 5);


        // 4. ENHANCED FOR LOOP
        System.out.println("\nEnhanced For Loop:");

        int[] numbers = {10, 20, 30, 40, 50};

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}