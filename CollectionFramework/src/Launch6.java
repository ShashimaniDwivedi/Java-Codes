import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Launch6 {
    public static void main(String[] args) {
        List AL=new ArrayList();//list is parent
        AL.add(100);
        AL.add(200);
        AL.add(300);
        AL.add(400);
        AL.add(2,250);
        System.out.println(AL);
        System.out.println(AL.contains(500));
        System.out.println(AL.indexOf(300));
        System.out.println(AL.size());
        //accessing data********************
       /* for(int i=0;i<AL.size();i++)
        {
        //Data stored as object
            Object o=AL.get(i);
            System.out.println(o);
        }
        for (Object k : AL) {
            System.out.println(k);
        }*/
        Iterator itr=AL.iterator();
        while (itr.hasNext())
        {
            // Integer i = (Integer) itr.next();
            //System.out.println(i);
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        System.out.println("****************");
        ListIterator li= AL.listIterator(AL.size());
        while(li.hasPrevious())
        {
            System.out.print(li.previous()+" ");
        }

    }
}
