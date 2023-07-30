public class HeapSort {
    public static void Swap(int []arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void printArray(int []arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void heapify(int []arr,int n,int i)
    {
        //Initialize largest value as root
        int largest=i;
        int l=2*i+1;
        int r=2*i+2;
        //if left child is larger than root
        if(l<n&&arr[l]>arr[largest])
        {
            largest=l;
        }
        //if right child is larger than root
        if(r<n&&arr[r]>arr[largest])
        {
            largest=r;
        }
        //if largest is not the root
        if(largest!=i)
        {
            Swap(arr,i,largest);
            heapify(arr,n,largest);
        }
    }
    public static void Heapsort(int[]arr,int n)
    {
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }
    public static void main(String[] args) {
        int arr[]={4,10,5,3,1,2};
        int n=5;
        System.out.println("Element Before Sorting are : ");
        printArray(arr,n);
        Heapsort(arr,n);
        System.out.println("Element after Sorting are : ");
        printArray(arr,n);
    }
}
