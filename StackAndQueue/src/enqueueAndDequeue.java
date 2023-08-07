import java.util.LinkedList;
import java.util.Queue;

public class enqueueAndDequeue {
    public static void main(String[] args) {
        int i=0;
        //We can implement queue using Linked list and priority queue
       //Internally doubly linked list ka use ho rha hai implement karne ke liye
        Queue<Integer>q=new LinkedList<>();
        for (i=0;i<10;i++)
        {
            q.add(i);
        }
        System.out.println("Data in queue : "+q);
        for (i=0;i<5;i++)
        {
            q.remove(i);
        }
        System.out.println("After Deletion Data left in a queue : "+q);
        System.out.println("Displaying the Top Element : "+q.peek());
        System.out.println("Displaying the Size of the queue : "+q.size());
        }
    }
//Tc O(1) Enqueue
//Sc O(1) Dequeue
