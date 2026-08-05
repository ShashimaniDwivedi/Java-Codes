import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Launch5 {
    public static void main(String[] args) {
        //Fail fast and failsafe
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(5);
        System.out.println(al);
       //Loop infinite time working
       /* for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
            al.add(100);
        }*/
        //fail fast condition******************
        ListIterator itr =al.listIterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
          //  al.add(200);
        }
        //fail with leading an exception
        //fail safe************************
        CopyOnWriteArrayList al1 = new CopyOnWriteArrayList();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(5);
        System.out.println(al1);
        Iterator itr1 = al1.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
            al.add(200);
        }
      //fail without leading any exception
    }
}

