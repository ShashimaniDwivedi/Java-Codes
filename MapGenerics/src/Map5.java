import java.util.Hashtable;

public class Map5 {
    public static void main(String[] args) {
        Hashtable ht =new Hashtable();
        ht.put(1,"sum");
        ht.put(2,"sub");
        ht.put(3,"Div");
        ht.putIfAbsent(5,"RAJ");
        //ht.put(null,null);//Null pointer exception
        System.out.println(ht);
    }
}
