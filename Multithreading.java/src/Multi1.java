 class  myThread extends   Thread
{

    public void run()
    {
        System.out.println("child thread");
    }

}


public class Multi1 {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        Thread t=new myThread();
        t.start();//passing it to thread scheduler by calling start method

    }
}
