import java.util.Scanner;

public class squareRoot {
    public static int findSquareRoot(int num)
    {
        int low=0,high=num,result=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            long val =mid*mid;
            if(val==num)
            {//perfect square
                return mid;
            }
            else if(val<num)
            {//store floor value,inCase the number is not perfect square
            result=mid;
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
        System.out.println("Enter element to find square root : ");
        int num=sc.nextInt();
        int result=findSquareRoot(num);
        System.out.println("SquareRoot of the given number is : "+result);
    }
}
