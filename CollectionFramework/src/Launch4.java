import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Launch4 {
    public static void main(String[] args) {
        HashSet hs1=new HashSet();
        hs1.add(12);
        hs1.add(23);
        hs1.add(35);
        hs1.add(1);
        hs1.add(2);
        System.out.println("Hashset : "+hs1);
        Iterator itr=hs1.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
        System.out.println();

        LinkedHashSet hs = new LinkedHashSet<>();
        hs.add(12);
        hs.add(89);
        hs.add(13);
        hs.add(5);
        hs.add(45);
        hs.add(11);
        try {
            hs.add("pw");
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        System.out.println(hs.contains(2));//return boolean value
        System.out.println(hs.size());
        System.out.println(hs);

    }
}

