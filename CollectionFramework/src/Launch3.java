import java.util.TreeSet;

public class Launch3 {
    public static void main(String[] args) {
        //ArrayDequeue*********************
      /* ArrayDeque ad=new ArrayDeque();
        ad.add(1);
        ad.add(7);
        ad.add(4);
        ad.add(5);
        ad.add(2);
        ad.add(3);
//        ad.offer(500);
//        ad.offerFirst( 5);
//        ad.offerLast(7);
        System.out.println(ad);*/
    //Priority Queue***********************
      /*  PriorityQueue pq=new PriorityQueue<>();
        pq.add(100);
        pq.add(200);
        pq.add(75);
        pq.add(23);
        pq.add(42);
        pq.add(75);
        pq.add("pw");
        System.out.println(pq);*/
        //TreeSet**************************
        TreeSet ts = new TreeSet();
        ts.add(10);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(5);
        ts.add(7);
        ts.add(8);
        System.out.println(ts);
        System.out.println(ts.size());
       System.out.println( ts.higher(75));
        System.out.println( ts.lower(75));
        System.out.println( ts.ceiling(50));
        System.out.println( ts.floor(50));
        System.out.println( ts.ceiling(40));
        System.out.println( ts.floor(40));
       // ts.add("pw"); class cast Exception
        System.out.println(ts);
    }
}
