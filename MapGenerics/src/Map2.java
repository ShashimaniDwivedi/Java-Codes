import java.util.HashMap;
import java.util.LinkedHashMap;

public class Map2 {
    public static void main(String[] args) {
        HashMap hm =new HashMap();
        hm.put(null,null);
        hm.put(1,"Virat");
        hm.put(2,30);
        System.out.println(hm);
        LinkedHashMap hm1 =new LinkedHashMap();
        hm1.put("Dhoni",null);
        hm1.put(1,"Ab Devilliers");
        hm1.put("raj",30);
        System.out.println(hm1);
    }
}
