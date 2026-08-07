import java.util.Scanner;

public class exep{
    public static void main(String[] args) {
        int num1=6;
        int num2=0;
        int res=0;
        try{
         res = num1/num2;
         System.out.println(res);
        }
        catch(Exception e){
            //IT execute only when exception occur
            System.out.println("Exception occured :"+e);
        }
        finally{
            System.out.println("Hello");
        }
        //try with resources
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter a number : ");
           int a=sc.nextInt();
           System.out.println(a);
           //try with resource automatically close resource
        }
    }
}
//we  can write try with catch or finally any one or both as needed
