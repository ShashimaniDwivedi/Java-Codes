
class Example implements Runnable {
    public void run() {
        for (int i = 0; i < 3; i++)

        try
        {
            System.out.println("Focus is important");
            Thread.sleep(3000);
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }

    }
}

public class Multi6 {
    public static void main(String[] args) {
        Example e = new Example();
        Thread t = new Thread(e);

        t.start();
        t.interrupt();

    }
}

