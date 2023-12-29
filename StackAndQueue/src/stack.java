import java.util.Scanner;

class Stack1 {
    int Top = -1;
    int n = 10;
    int[] arr = new int[n];

    void push() {
        Scanner sc = new Scanner(System.in);
        if (Top == n - 1) {
            System.out.println("Overflow");
        } else {
            System.out.println("Enter element to be added onto the stack :  ");
            int x = sc.nextInt();
            Top++;
            arr[Top] = x;
            System.out.println("Inserted item is : " + x);
        }
    }

    int pop() {
        int res = 0;
        if (Top == -1) {
            System.out.println("Underflow");
        } else {
            res = arr[Top];
            System.out.println("Deleted item is :" + arr[Top]);
            Top--;
        }
        return res;
    }

    void Empty() {
        boolean a = (Top == -1);
        System.out.println("Stack is Empty : "+a);
    }

    void size() {
        int b = Top + 1;
        System.out.println("Size of Stack is : "+b);
    }

    void Peek() {
        if (Top == -1) {
            System.out.println("Stack is Empty");
        }
        else {
            System.out.println("Peek Element in Stack is : "+arr[Top]);
        }
    }
    void show() {
        if (Top == -1) {
            System.out.println("Stack is empty ");
        } else {
            System.out.println("Items  in stack are : ");
        }
        for (int j = Top; j >= 0; j--) {
            System.out.println(arr[j]);
        }
    }
}

public class stack {
    public static void main(String[] args) {
        int ch, l;
        Scanner sc = new Scanner(System.in);
        Stack1 s = new Stack1();
        do {
            System.out.println("*****MainMenu*****");
            System.out.println("1:PUSH");
            System.out.println("2:POP");
            System.out.println("3:DISPLAY");
            System.out.println("4:EMPTY");
            System.out.println("5:SIZE");
            System.out.println("6:PEEK");
            System.out.println("Enter choice : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    s.push();
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.show();
                    break;
                case 4:
                    s.Empty();
                    break;
                case 5:
                    s.size();
                    break;
                case 6:
                    s.Peek();
                    break; 
            }
            System.out.println("Enter 0 to go back to main menu");
            l = sc.nextInt();
        }
        while (l == 0);
    }
}