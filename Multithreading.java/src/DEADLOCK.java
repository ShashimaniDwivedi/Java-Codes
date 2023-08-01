
class Library implements Runnable {

    String s1 = new String("JAVA");
    String s2 = new String("SQL");
    String s3 = new String("DSA");

    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals("Student 1")) {
            try {
                Thread.sleep(3000);
                synchronized (s1) {
                    System.out.println("Student 1 has acquired " + s1);
                    Thread.sleep(3000);
                    synchronized (s2) {
                        System.out.println("Student 1 has acquired " + s2);
                        Thread.sleep(3000);
                        synchronized (s3) {
                            System.out.println("Student 1 has acquired " + s3);
                            Thread.sleep(3000);
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Error");
            }
        } else {
            try {
                Thread.sleep(3000);
                synchronized ((s3)) {
                    System.out.println("Student 2 has acquired " + s3);
                    Thread.sleep(3000);
                    synchronized ((s2)) {
                        System.out.println("Student 2 has acquired " + s2);
                        Thread.sleep(3000);
                        synchronized (s1) {
                            System.out.println("Student 2 has acquired " +s1);
                            Thread.sleep(3000);
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Error");
            }
        }

    }

}

public class DEADLOCK {
    public static void main(String[] args) {
        Library l = new Library();
        Thread t1 = new Thread(l);
        Thread t2 = new Thread(l);
        t1.setName("Student 1");//giving name to thread
        t2.setName("Student 2");

        t1.start();
        t2.start();

    }
}
