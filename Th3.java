import java.util.Scanner;

public class Th3 extends Thread{
    public void run(){
        if(getName().equals("calc")) calc();
        else impMsg();
    }
    public void calc(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number 1 : ");
    int num1=sc.nextInt();
    System.out.println("Enter number 2 : ");
    int num2=sc.nextInt();
    int res=num1+num2;
    System.out.println("Calculation Started");
    System.out.println(res);
    System.out.println("Calculation task Ended");
    }

    public void impMsg() {
        try{
         for(int i=0;i<3;i++){
            System.out.println("Displaying imp msg");
            Thread.sleep(2000);
        }
    }catch(Exception e){System.out.println("Some Error");}
    }

    


    public static void main(String[] args) {
        Th3 t1=new Th3();
        Th3 t2=new Th3();
        t1.setName("calc");
        t2.setName("msg");
        t1.start();
        t2.start();
    }
}
