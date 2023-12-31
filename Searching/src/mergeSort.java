//Tc O(n logn)
//Sc O(n)
//out place sorting algorithm because using extra space
public class mergeSort {
    //Function to combine left and right sub array
    //l=lower index
    //h=higher index
    public static void mergeProcedure(int[] arr, int l, int mid, int h) {

        int i, j, k;
        // i=left subArray pointer
        //j=right subArray pointer
        //k=Original Array pointer
        //size of left and right sub array
        int n1 = mid - l + 1;
        int n2 = h - mid;
        //create left and right sub array
        int[] lSubArray = new int[n1];
        int[] rSubArray = new int[n2];
        //Copy the data into the left and right sub array
        for (i = 0; i < n1; i++) {
            lSubArray[i] = arr[l + i];
        }
        for (j = 0; j < n2; j++) {
            rSubArray[j] = arr[mid + 1 + j];
        }
        //Comparison between the element in left and right sub array
        i = 0;
        j = 0;
        k = l;
        while (i < n1 && j < n2) {
            if (lSubArray[i] < rSubArray[j]) {
                arr[k] = lSubArray[i];
                i++;
            } else {
                arr[k] = rSubArray[j];
                j++;
            }
            k++;
        }
        //Copying all the element from left sub array
        //Best case scenario
        while (i < n1) {
            arr[k] = lSubArray[i];
            i++;
            k++;
        }
        //Copying all the element from right sub array
        // Best case scenario
        while (j < n2) {
            arr[k] = rSubArray[j];
            j++;
            k++;
        }

    }

    //Function to do merge sort
    public static void mergeSort(int[] arr, int i, int j) {
        int mid;
        if (i < j) {
            // Divide the array into two sub problem
            mid = i + (j - i) / 2;
            //Conquer the Sub problem using recursion
            mergeSort(arr, 0, mid);//Left subtree
            mergeSort(arr, mid + 1, j);//Right subtree
            //Combine the solution of all sub problem
            mergeProcedure(arr, i, mid, j);
        }
    }

    //Function to display array
    public static void printArr(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr = {50, 20, 40, 90, 88, 11, 13};
        int n = arr.length;
        System.out.print("Array Before Sorting is : ");
        printArr(arr, n);
        mergeSort(arr, 0, n - 1);
        System.out.print("Array After Sorting is : ");
        printArr(arr, n);

    }
}
