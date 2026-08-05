import java.util.Scanner;
//Achieving Multithreading using single run method
class myThread1  extends Thread {
    public void run() {
        String Name = Thread.currentThread().getName();
        if (Name.equals("calc"))
        {
            calc2();
        }
        else
        {
        msg();
        }
    }

    public void calc2() {
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

    public void msg()
    {
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

public class Multi4 {
    public static void main(String[] args) {
        System.out.println("Main Thread started");
        myThread1 t1=new myThread1();
        myThread1 t2=new myThread1();

        t1.setName("calc");
        t2.setName("Print");

        t1.start();
        t2.start();

    }

}

