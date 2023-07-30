import java.util.Arrays;
import java.util.Scanner;
//TC O(n^2)
//SC O(1)
public class insertionSort {
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++)
        {
            int j= i;
            while (arr[j] < arr[j - 1] && j > 0) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int n = sc.nextInt();
        System.out.println("Enter element : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        insertionSort(arr);
        System.out.print("Sorted Array : " + Arrays.toString(arr));
    }
}
