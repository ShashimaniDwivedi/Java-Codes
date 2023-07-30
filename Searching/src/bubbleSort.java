import java.util.Arrays;
import java.util.Scanner;
//TC O(n^2);
//SC O(1);
public class bubbleSort {
    public static int bubble(int arr[])
    {
        boolean swapped=false;
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr.length -i- 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped=true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }
        return arr[arr.length-2];
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
            bubble(arr);
            System.out.print("Sorted Array : "+Arrays.toString(arr));
    }
}
