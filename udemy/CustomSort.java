import java.util.*;

public class CustomSort {
    public static void main(String[] args) {
        List<Integer>l=new ArrayList<>();
        Comparator<Integer>com=new Comparator<Integer>(){
            public int compare(Integer i,Integer j){
            if(i%10>j%10) return 1;
            return -1;
            }
        };
        l.add(23);
        l.add(87);
        l.add(76);
        l.add(45);
        l.add(43);
        //inbuild sort
        Collections.sort(l,com);
        //If i want to sort based on ones digit 
        // then we have to use custom sort which is done using comparator
        System.out.println(l);
    }
}
