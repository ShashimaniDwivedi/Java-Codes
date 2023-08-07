public class DeletionHeap {
    static int n = 0;
    static int[] arr = new int[100];

    public static void insert(int value)
    {
        n++;
        arr[n-1]=value;
        int i=n-1;
        int parent=(i-1)/2;
        //if parent is smaller then swap
        while(i>0&&arr[(i-1)/2]<arr[i])
        {
            swap((i-1)/2,i);
            //i ko update bna diya
            i=(i-1)/2;
        }
    }
    public static int remove()
    {
         int deleted=arr[0];
        //replace root with last element
        arr[0]=arr[n-1];
        //Decrement n value;
        n--;
        //Root index
        int i=0;
        //go to only last parent
        while(i<(n-1)/2)
        {
            //swap if child is greater
            if(arr[2*i+1]>arr[i] ||arr[2*i+2]>arr[i])
            {
                //swap with maximum
                int maximum=(arr[2*i+1]>arr[2*1+2])?2*i+1:2*i+2;
                swap(i,maximum);
                //Update i with maximum
                i=maximum;
            }
        }
        return deleted;
    }
    public static void printArray(){
        for(int i=0 ; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] =temp;
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
        System.out.println("Element After Deletion");
        int deleted=remove();
        printArray();
        System.out.println("First maximum element is "+deleted);

    }
}