import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int current = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[current] > arr[j]) {
                    current=j;
                }
            }
            if(arr[current]!=i)
            {
                int temp=arr[current];
                arr[current]=arr[i];
                arr[i]=temp;
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
        selectionSort(arr);
        System.out.print("Sorted Array : " + Arrays.toString(arr));
    }
}

