import java.util.*;

public class typeOfMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(8, "Ram");
        hm.put(1, "Aman");
        hm.put(7, "Ajit");
        hm.put(5, "Raman");
        System.out.println("Hashmap looks like : " + hm);
        LinkedHashMap<Integer, String> hm1 = new LinkedHashMap<>();
        hm1.put(8, "Ram");
        hm1.put(1, "Aman");
        hm1.put(7, "Ajit");
        hm1.put(5, "Raman");
        System.out.println("LinkedHashmap looks like : " + hm1);
        TreeMap<Integer, String> hm2 = new TreeMap<>();
        hm2.put(8, "Ram");
        hm2.put(1, "Aman");
        hm2.put(7, "Ajit");
        hm2.put(5, "Raman");
        System.out.println("Treemap looks like : " + hm2);
        Hashtable<Integer, String> hm3 = new Hashtable<>();
        hm3.put(8, "Ram");
        hm3.put(1, "Aman");
        hm3.put(7, "Ajit");
        hm3.put(5, "Raman");
        System.out.println("Hashtable looks like : " + hm3);
    }
}
