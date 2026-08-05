import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num=0;
//        Scanner sc=new Scanner(System.in);
        //try with resource
        try(Scanner sc=new Scanner(System.in);)
        {
      //  try {
           num=sc.nextInt();
        }
        catch(Exception obj)
        {
            System.out.println("Something went wrong..."+obj);
        }
  //      finally {
  //          sc.close();
  //      }
        System.out.println(num);
    }
}