import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pyramid: ");
        int Rows = scanner.nextInt();
        
        for (int i = 1; i <= Rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= Rows - i; j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            
            // Move to the next line
            System.out.println();
        }
        
        scanner.close();
    }
}

