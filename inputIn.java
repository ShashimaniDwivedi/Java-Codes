import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class inputIn{
    public static void main(String[] args) throws IOException{
        //Method 1
        System.out.println("Enter name : ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        System.out.println("Entered name is  : " + name);
        System.out.println("Enter number : ");
        int a =Integer.parseInt(br.readLine());
        System.out.println("Entered numbered is : " +a);
        //Method 2
        Scanner sc =new Scanner(System.in);
        String x=sc.nextLine();
        int y=sc.nextInt();
        float z=sc.nextFloat();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    
}