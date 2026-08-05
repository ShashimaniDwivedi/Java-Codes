import java.util.ArrayList;

public class Launch1 {
    public static void main(String[] args) {

        //Arraylist*************************************


        ArrayList al =new ArrayList();
        al.add("Pw skills");
        al.add(1);
        al.add("java");
        al.add(1.1);
        System.out.println(al);

        ArrayList al1 =new ArrayList();
        al1.add(1);
        al1.add(4);
        al1.add(3);
        System.out.println(al1);
        System.out.println("After adding collection");
        al1.addAll(al);
        System.out.println(al1);

        al1.add(2,al);
        System.out.println(al1);

    }
}
