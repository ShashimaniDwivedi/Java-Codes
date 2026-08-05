import java.util.Scanner;

class Demo
{
  public void run()
  {
      System.out.println("In Demo");
  }

}

class calc  extends Demo implements Runnable{ //in runnable we can extend and implement at a same time
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

class Message1 implements Runnable {
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


public class Multi3 {
    public static void main(String[] args) {
        System.out.println("Main Thread started");
        calc c1 = new calc();
        Message1 m1 = new Message1();
        Demo d=new Demo();
        Thread t1=new Thread(c1);
        //Passing Reference
        Thread t2=new Thread(m1);


        t1.start();
        t2.start();



    }

}

