import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Launch3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
       /*
        list.add(7);
        list.add(8);
        list.add(6);
        list.add(9);
        list.add(3);
        System.out.println(list);*/
        List list1 = Arrays.asList(2, 3, 4, 5, 6, 7);
        System.out.println(list1);
        //Using for loop*****************
        /*for(int i=0;i< list1.size();i++)
        {
            System.out.print(list1.get(i));
        }*/
        //using foreach loop************
       /*for(Object o:list1)
        {
            System.out.println(o);
        }*/
        //using foreach method 1**********
        Consumer<Integer>c=new Consumer<Integer>() {
            @Override
            //no of calls=no of value
            public void accept(Integer integer) {
                System.out.print(integer+",");
            }
        };
        //using foreach method 2**********
        //Consumer<Integer>c1=i-> System.out.print(i+",");
        list1.forEach(c);
        //for each method internally Consumer interface ko implement karta hai
        //using foreach method 3***********
        list1.forEach(n->System.out.print(n+","));
    }
}
