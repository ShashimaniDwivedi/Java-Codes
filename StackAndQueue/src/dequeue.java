import java.util.*;

public class dequeue {
    public static void main(String[] args) {
        Deque<Integer> D1 = new ArrayDeque<>();
        D1.addLast(2);
        D1.addLast(5);
        D1.addLast(7);
        D1.addLast(9);
        System.out.println("Dequeue output looks like : "+D1);
        System.out.println("Implementing Stack By Following LIFO: "+D1.removeLast());
        System.out.println("Implementing Queue By Following FIFO: "+D1.removeFirst());
    }

}
