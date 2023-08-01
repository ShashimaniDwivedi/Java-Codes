
class car implements Runnable
{
    public void run()
    {

        try
        {
            System.out.println(Thread.currentThread().getName()+"In parking lot");
            Thread.sleep(2000);
            synchronized (this)//for specific block
            {
                System.out.println(Thread.currentThread().getName() + "get into car");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + "Driving the car");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + "parked the car");
                Thread.sleep(2000);
            }
        }
        catch (Exception e)
        {
            System.out.println("Some problem");
        }


    }
}
public class Multi7 {
    public static void main(String[] args) {
        car c=new car();
        Thread t1=new Thread(c);
        Thread t2=new Thread(c);
        Thread t3=new Thread(c);

        t1.setName("son 1");
        t2.setName("son 2");
        t3.setName("son 3");

        t1.start();
        t2.start();
        t3.start();

    }
}
