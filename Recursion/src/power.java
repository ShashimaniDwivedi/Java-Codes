/*import java.util.Scanner;

public class power {
    public static int powerNum(int x,int y) {
        int result;
        if (y == 1)//base case
        {
            return x;
        } else if (y == 0) {
            return 1;
        } else {
            result= x * powerNum(x, y - 1);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int value=powerNum(num1,num2);
        System.out.println("The power of num1 and num2 is : "+value);
    }
}*/
//TC O()
//SC O()

import java.math.BigInteger;
import java.util.Scanner;

public class power {
    public static BigInteger powerNum(BigInteger x, int y) {
        BigInteger result,finalResult;
        if (y == 1)//base case
        {
            return x;
        }
       /* else if(y==0)
        {
            return 1;
        }*/
        else
        {
            result= powerNum(x, y/2);
            finalResult=result.multiply(result);//you have to use multiply instead of *
        }
        if(y%2==0)
        {
            return finalResult;
        }
        else
        {
            return x.multiply(finalResult);
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the value of num1 and num2 : ");
        Scanner sc=new Scanner(System.in);
        BigInteger num1=sc.nextBigInteger();
        int num2=sc.nextInt();
        BigInteger value=powerNum( num1,num2);
        System.out.println("The power of num1^num2 is : "+value);
    }
}
//TC O(log y)
