import java.util.Scanner;

class Calc extends Thread{
    Scanner sc=new Scanner(System.in);
    public void run(){
    System.out.println("Enter number 1 : ");
    int num1=sc.nextInt();
    System.out.println("Enter number 2 : ");
    int num2=sc.nextInt();
    int res=num1+num2;
    System.out.println("Calculation Started");
    System.out.println(res);
    }
    
}

class Msg extends Thread {
    public void run(){
        try{
        for(int i=0;i<3;i++){
            System.out.println("Displaying imp msg");
            Thread.sleep(2000);
        }
    }
    catch(Exception e){
        System.out.println("Some Problem");
    }
    }
}


public class Th1{
    public static void main(String[] args) {
        Calc c=new Calc();
        Msg m=new Msg();
        c.start();
        m.start();
    }
}
