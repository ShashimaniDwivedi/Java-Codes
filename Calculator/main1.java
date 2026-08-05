package Calculator;
import Calculator.Addition.Add1;
import Calculator.Subtraction.Sub1;
import Calculator.Multiplication.Mul1;
import Calculator.Divide.Div1;
import Calculator.Modulo.Mod1;
import java.util.*;

public class main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("***CALCULATOR***");
        System.out.println("1. ADDITON");
        System.out.println("2. SUBTRACTION");
        System.out.println("3. MULTIPLICATION");
        System.out.println("4. DIVISION");
        System.out.println("5. MODULO");
        int choice=sc.nextInt();
        sc.close();
        switch(choice){
            case 1 : 
            Add1 a1=new Add1();
            System.out.println("Result of Addition is :"+a1.add1(a,b));
            break;
            case 2 : 
            Sub1 s1=new Sub1();
            System.out.println("Result of Subtraction is :"+s1.sub1(a,b));
            break;
            case 3 : 
            Mul1 m1=new Mul1();
            System.out.println("Result of Multiplication is :"+m1.mul1(a,b));
            break;
            case 4 : 
            Div1 d1=new Div1();
            System.out.println("Result of division is :"+d1.div1(a,b));
            break;
            case 5 : 
            Mod1 m2=new Mod1();
            System.out.println("Result of Modulo is :"+m2.mod1(a,b));
            break;
            default:
                System.out.println("Invalid Entry");

        }
    }
    
}
