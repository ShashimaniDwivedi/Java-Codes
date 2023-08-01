
class Printing implements Runnable
{
    public void run()
    {
        try
        {
            for(int i=0;i<2;i++)
            {
                System.out.println("Focus is important");
                Thread.sleep(3000);
            }
        }
        catch(Exception e)
        {
          System.out.println("Error" +e);
        }
    }
}

public class Multi5 {
    public static void main(String[] args) throws Exception{//Ducking
        System.out.println("Main thread started");
        Printing p=new Printing();
        Thread t=new Thread(p);
        System.out.println(t.isAlive());

        t.start();
        System.out.println(t.isAlive());//life Allocated
        t.join();

        System.out.println("Main thread Finished");
    }
}
