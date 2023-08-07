import java.util.Stack;
//Tc of enqueue O(1)
//Tc of dequeue O(n)
//Sc O(n)

public class queueUsingStack {
    static Stack<Integer> stack1=new Stack<>();
    static Stack<Integer> stack2=new Stack<>();
    //Insertion of the data in the queue
    //Time complexity O(1)
    static void enQueue(int data)
    {
        stack1.push(data);
    }
    static int deQueue() {
        int ele;
        if (stack1.empty() && stack2.empty()) {
            System.out.println("Queue is empty");
            System.exit(0);
        }
        //Push all element from stack1 and put into stack2
        //Tc O(n)
        if (stack2.empty()) {
            while (!stack1.empty()) {
                ele = stack1.pop();
                stack2.push(ele);
            }
        }
        //Pop the top element from stack2
        //FIFO
        ele=stack2.pop();
        return ele;
    }

    public static void main(String[] args) {
    queueUsingStack q=new queueUsingStack();
    //Function calling for insertion
    q.enQueue(1);
    q.enQueue(2);
    q.enQueue(3);
    q.enQueue(4);
    //Function calling for deletion
    System.out.println("Deleted element is : "+q.deQueue());
    System.out.println("Deleted element is : "+q.deQueue());
    System.out.println("Deleted element is : "+q.deQueue());
    System.out.println("Deleted element is : "+q.deQueue());
    System.out.println("Deleted element is : "+q.deQueue());
    }
}
