import java.util.ArrayList;

public class Map1 {
    public static void main(String[] args) {
        //type safety is achieved using Generics <String>
        ArrayList<String> a1=new ArrayList<String>();
        a1.add("Manas");
        a1.add("Pw");
        //a1.add(10);//throwing error
        a1.get(0);
        a1.get(1);
        System.out.println(a1.get(0));
        System.out.println(a1.get(1));
    }
}
