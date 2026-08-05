import java.util.Scanner;
//0 1 1 2 3 5 8 13 21
public class fibonacci {
    public static int fib(int num)
    {
        int result;
        if(num==0||num==1)
        {
            return num;
        }
        else {
             result= fib(num-1)+fib(num-2);
        }
      return result;
    }
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int x= fib(num);
        System.out.println("Fibonacci series is : "+x);
    }
}
//TC O(2^n)
//SC O(n)//to store all the function calls
/*
//printing upto n fibonacci series
import java.util.Scanner;

public class fibonacci {
    public static int fib(int num)
    {
        //int result;
        if(num==0||num==1)
        {
            return num;
        }
        else {
             return fib(num-1)+fib(num-2);
        }

    }
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.print("Fibonacci series is : ");
        for(int i=0;i<num;i++)
        {
            System.out.print(" "+fib(i));
        }
    }
}

 */
