import java.util.LinkedList;

public class Launch2 {
    public static void main(String[] args) {
//        List l=new LinkedList();
//        l.add(100);
//        l.add(234);
//        l.add(300);
//        System.out.println(l.listIterator());//not working
//        System.out.println(l);
        LinkedList ll=new LinkedList();
        ll.addFirst(0001);
        ll.add("Pw Skill");
        ll.add(200);
        ll.addLast(786);
        ll.add(3,13);
       // System.out.println(ll.clone());
        ll.push(10);//insert element at starting of list
       System.out.println(ll);
        System.out.println(ll.pop());//DElete element from starting of list
        System.out.println(ll);

      /*  System.out.println(ll.get(2));
        System.out.println(ll.peek());//Original list not affected
        System.out.println(ll);
        System.out.println(ll.poll());//Original list affected
        System.out.println(ll);*/

    }
}
