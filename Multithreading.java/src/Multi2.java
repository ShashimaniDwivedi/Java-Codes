import java.util.Scanner;
//Here we have only single thread
//to execute all process simultaneously we use multithreading
class calc1  extends Thread{
    public void run() {
        System.out.println("Calculation stated");
        System.out.println("Enter first number");
        System.out.println("Enter second number");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int res = num1 + num2;
        System.out.println(res);
        System.out.println("Calculation task ended");
        System.out.println("************************************");

    }
}

class Message extends Thread {
    public void run() {
        System.out.println("Displaying important message task");
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Focus is important to master skills");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("Some thing went wrong" + e);
        }
        System.out.println("Displaying important message task Ended");
    }

}


public class Multi2 {
    public static void main(String[] args) {
        System.out.println("Main Thread started");
        calc1 t1 = new calc1();
        Message t2 = new Message();

        t1.start();
        t2.start();


    }

}
