import java.util.HashMap;
import java.util.Map;

public class funcHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String>hm=new HashMap<>();
        hm.put(1,"Manas");
        hm.put(2,"Ayush");
        hm.put(3,"Devang");
        hm.put(4,"Raj");
        System.out.println("Hash map of the given data is : "+hm);
        System.out.println(hm.get(1));//to get specific value using index
        hm.remove(4);//to remove element
        System.out.println(hm.containsKey(5));//give boolean result
        for(Map.Entry<Integer,String > e : hm.entrySet()) {
            System.out.println("Hashmap is "+e.getKey() + " : " + e.getValue());
        }
    }
}
