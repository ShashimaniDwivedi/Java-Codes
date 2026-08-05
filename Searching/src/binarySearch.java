import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int n = sc.nextInt();
        System.out.println("Enter element : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element you want to search : ");
        int element = sc.nextInt();
        int low = 0, high = n - 1, mid = 0;
        while (low <= high) {
         //in mid first formulae their will be a condition of overflow
         //to avoid this 2nd formulae is recommended
            mid = (low + high) / 2;//or use mid=low+(mid-low)/2
            if (arr[mid] == element) {
                System.out.println("Element found at index : " + mid);
                break;
            }
            if (arr[mid] < element) {
                low = mid + 1;
            }
            if (arr[mid] > element) {
                high = mid - 1;
            }

        }
        if (arr[mid] != element) {
            System.out.println("Element not found");
        }

    }
}
//Tc=O(log n);
//Sc=O(1);
//Advantage
//Tc is less as compare to linear search
//Disadvantage
//only applicable for sorted array
