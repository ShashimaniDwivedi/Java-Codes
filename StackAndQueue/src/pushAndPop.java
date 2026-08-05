import java.util.Stack;
//Implementing various Stack operation Using stack class
public class pushAndPop {
    public static void main(String[] args) {
        Stack<Integer> stack1=new Stack<>();
        stack1.push(2);
        stack1.push(4);
        stack1.push(6);
        stack1.push(9);
        System.out.println("Element in stack : "+stack1);
        System.out.println("Top most element in the stack: "+stack1.peek());
        stack1.pop();
        System.out.println("Stack after deletion : "+stack1);
        //search function return -1 if element is not present
        System.out.println("Element is present at position : "+stack1.search(4));
       //Empty() return boolean value
        System.out.println(" Checking Whether the Stack is empty or not : "+stack1.empty());
    }
}
