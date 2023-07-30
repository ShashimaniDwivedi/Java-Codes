import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        System.out.println("Enter size : ");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("Enter element : ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element you want to search : ");
        int element =sc.nextInt();
        int flag=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==element)
            {
                flag=i;
                break;
            }

        }
        if(flag==0)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Element found at index " + flag);
        }
    }
}
//tc=O(n);
//sc=O(1);
//Advantage
//simple to understand
//useful in every instances (ascending or descending)
//Disadvantage
//if size of array is very large then time require is  very high

