import java.util.Scanner;
//0 1 1 2 3 5 8 13 21 fibonacci
  //1 2 3 5 8 13 21//staircase
public class stairCase {
    public static int stair(int n)
    {
        int result=0;
        if(n==0||n==1)
        {
         return n;
        }
        else
        {
            result=stair(n-1)+stair(n-2);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int x=stair(num+1);
        System.out.println("The number of ways are : "+x);
    }
}
//TC O(2^n)
//SC O(n)
