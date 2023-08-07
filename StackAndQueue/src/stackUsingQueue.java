import java.util.LinkedList;
import java.util.Queue;
//TC Insert O(n)
//TC pop O(1)
//SC O(n)
public class stackUsingQueue {
    static Queue<Integer>queue1=new LinkedList<>();
    static Queue<Integer>queue2=new LinkedList<>();
       //To add a new element in the stack
    static void add(int data)
    {
        //Move all element from q1 to q2
        while(!queue1.isEmpty())
        {
            queue2.add(queue1.peek());
            //Poll() is also be used to remove element element from queue
            queue1.poll();
        }
        //Push new data in queue1
        queue1.add(data);
        //Move back all the element from queue2 to queue1
        while(!queue2.isEmpty())
        {
            queue1.add(queue2.peek());
            queue2.poll();
        }
    }
    //to delete the element from the stack
    static int remove()
    {
        if(queue1.isEmpty())
        {
            System.out.println("Queue Underflow");
            System.exit(0);
        }
        int ele=queue1.peek();
        queue1.poll();
        return ele;
    }
    public static void main(String[] args) {
        stackUsingQueue s=new stackUsingQueue();
        //Push all the element in the stack
        s.add(2);
        s.add(5);
        s.add(9);
        s.add(12);
        //pop all element from stack
        System.out.println("Deleted element from stack is : "+s.remove());

    }
}
