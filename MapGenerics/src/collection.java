import java.util.ArrayList;
import java.util.Collections;

public class collection {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Shashimani Dwivedi");
        al.add("Air 1");
        al.add("Cse");
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);

        ArrayList al1 = new ArrayList();
        al1.add(10);//index 0
        al1.add(20);//index 1
        al1.add(30);//index 2
        al1.add(20);//index 3
        al1.add(50);//index 4
        al1.add(60);//index 5
        System.out.println(al1);
        int index=Collections.binarySearch(al1,30);
        System.out.println("Index is : "+index);
         Collections.rotate(al1,2);
        System.out.println(al1);
        Collections.shuffle(al1);
        System.out.println(al1);
        System.out.println(Collections.frequency(al1,20));
    }
}