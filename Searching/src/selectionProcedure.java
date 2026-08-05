public class selectionProcedure {
    public static int selectionProcedure(int arr[],int l,int h,int k)
    {
        int m=partition(arr,l,h);
            if(m==k-1)
            {
                return arr[m];
            }
            //traverse toward right side
            else if(m<k-1)
            {
                return selectionProcedure(arr,m+1,h,k);
            }
            //traverse toward left side
            else {
                return selectionProcedure(arr,l,m-1,k);
            }
    }
    public static int partition(int arr[],int l,int h)
    {
        int i=l;
        //pivot as the first element in an array
        int pivot=arr[l];
        for(int j=l+1;j<=h;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        //to return pivot to its original position
        int temp=arr[l];
        arr[l]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String[] args) {
        int []arr={50,20,40,90,88,11,13};
        int n=arr.length;
        int k=3;
        int num=selectionProcedure(arr,0,n-1,k);

        System.out.println("The "+k+" Smallest element in an array : "+num);

    }
}
