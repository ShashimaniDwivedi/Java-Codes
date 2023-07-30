import java.util.Scanner;

public class lowerBound {
    public static int findingFirstOccurence(int arr[],int target)
    {
        int low=0;
        int high=arr.length;
        int result=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==target)
            {
                result=mid;
                high=mid-1;
            }
            else if(arr[mid]<target)
            {
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        System.out.println("Enter element");
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
             arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target=sc.nextInt();
        int result=findingFirstOccurence(arr,target);
        if (result==-1)
        {
            System.out.println("Target element is not present");
        }
        else {
            System.out.println("Target element is present at index :"+result);
        }

    }
}
//TC=O(log n);
//SC =O(1);
