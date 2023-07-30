import java.util.Scanner;
//Number of recursive call is equal to number of fixed choices
public class factorial {
    public static int fact(int num) {
        int result;
        if (num == 0 || num == 1) {//Terminating condition
            return 1;
        } else {
            result = num * fact(num - 1);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.print("Enter number to find factorial : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       int x= fact(num);
        System.out.println("Factorial is : "+x);
    }
}
//TC=O(n)
//SC=O(n)
