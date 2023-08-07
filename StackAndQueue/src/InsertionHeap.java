public class InsertionHeap {
    static int arr[] = new int[100];
    static int n=0;

    public static void Swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray() {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
//MAX heap
    public static void insert(int value) {
        n++;
        arr[n - 1] = value;
        int i = n - 1;
        int parent = (i - 1) / 2;
        // if parent is smaller then swap
        while (i > 0 && arr[(i - 1) / 2] < arr[i]) {
            Swap((i - 1) / 2, i);
            // i ko update bna diya
            i = (i - 1) / 2;
        }
    }

    public static void main(String[] args) {
        insert(50);
        insert(30);
        insert(40);
        insert(10);
        insert(5);
        insert(20);
        insert(30);
         System.out.println("Before Insertion,heap element are :");
         printArray();
        insert(60);
         System.out.println("After Insertion,heap element are :");
        printArray();
    }
}
