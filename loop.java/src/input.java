import java.util.Scanner;//Header file to input from console
public class input {
    public static void main(String[] args) {
//        int i;
//
///*
//        for (i = 0; i < 5; i++) {
//            for (j = 0; j < i; j++)
//                System.out.println("*");
//            System.out.println("\n");
//            i = 0;
//*/
//        i=0;
//        while (i < 5) {
//                System.out.println("*");
//                i++;
//            }
//
//        int y=0;
//        do{
//            System.out.println("*");
//            y++;
//        }
//        while(y<5);
//    }
        System.out.println("Enter the age :");
        Scanner scan = new Scanner(System.in);// Declare only one time
        int age=scan.nextInt();
        System.out.println("Age is :" +age);
        System.out.println("Enter the name :");
        String name=scan.next();//next ya nextLine
        System.out.println("Name is :"+name);
        System.out.println("Enter the avg :");
        double avg=scan.nextDouble();//Double in capital
        System.out.println("Enter the avg :"+avg);
        System.out.print("Enter the age :");//cursor not move to next line
        System.out.println("Enter the age :");//cursor move to next line
    }
}
