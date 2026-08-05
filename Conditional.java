import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        System.out.println("Enter Your Age : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>18){
            System.out.println("You can vote");
        }
        else if(num>16&& num<18){
            System.out.println("You can vote after few year");
        }
        else{
            System.out.println("You cannot vote ");
        }
        //Ternary Operator
        int x=10;
        boolean res = x > 5 ? true:false;
        System.out.println(res);
        int a=10,b=20,c=30;
        int ans=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.printf("Greatest number is %d\n",ans);

        //Switch case
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid Day");
        }
        //Java 14 switch

           switch (day) {
    case 1 -> System.out.println("Monday");
    case 2 -> System.out.println("Tuesday");
    case 3 -> System.out.println("Wednesday");
    default -> System.out.println("Invalid");
}

    }
}
