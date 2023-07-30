public class randomizedQuickSort {
    public static void quickSort(int []arr,int l,int h)
    {
        if(l<h)
        {
            //Dividing the array into subProblem
            int m=partition(arr,l,h);
            //Conquer those sub problem via recursion
            quickSort(arr,l,m-1);
            quickSort(arr,m+1,h);
        }
    }
    public static int partition(int []arr,int l,int h)
    {
        //Generate random index within an array
        //pivot element is not fixed
        int randomIndex=l+(int)Math.random()%(h-l+1);
        int tem=arr[randomIndex];
        arr[randomIndex]=arr[l];
        arr[l]=tem;
        int i=l;
        //pivot as the first element in an array
        int pivot=arr[l];
        for(int j=l+1;j<=h;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        //to return pivot to its original position
        int temp1=arr[l];
        arr[l]=arr[i];
        arr[i]=temp1;
        return i;
    }
    public static void printArr(int []arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
  /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int n = sc.nextInt();
        System.out.println("Enter element : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }*/
        int []arr={50,20,40,90,88,11,13};
        int n=arr.length;
        System.out.println("Array Before Sorting is : ");
        printArr(arr,n);
        quickSort(arr,0,n-1);
        System.out.println("Array After Sorting is : ");
        printArr(arr,n);
    }
}
