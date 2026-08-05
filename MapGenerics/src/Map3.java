import java.util.*;

public class Map3 {
    public static void main(String[] args) {

        HashMap hm = new HashMap();
        hm.put(1, "ram");
        hm.put(2, "ramesh");
        hm.put(3, "ravi");
        hm.put(4, "raj");
        System.out.println(hm);
        System.out.println(hm.get(4));

        Set keyset=hm.keySet();//key set method return keys
        Iterator itr=keyset.iterator();
        while(itr.hasNext())
        {
             Integer key= (Integer)itr.next();//Down casting
            System.out.println(key);
           //System.out.println(itr.next());

        }
        Collection values=hm.values();//values method return values
          Iterator itr1= values.iterator();
          while(itr1.hasNext())
          {
              System.out.println(itr1.next());
          }
        Set entryset=hm.entrySet();//entry set return both eys and value
          Iterator itr2=entryset.iterator();
          while(itr2.hasNext()){
              Map.Entry val=(Map.Entry)itr2.next();//if you want to access Entry then you have to access map first
              System.out.println(val);
              //System.out.println(itr2.next());
          }
    }
}
