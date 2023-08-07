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

    void pop() {
        if (Top == -1) {
            System.out.println("Underflow");
        } else {
            System.out.println("Deleted item is :" + arr[Top]);
            Top--;
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
            }
            System.out.println("Enter 0 to go back to main menu");
            l = sc.nextInt();
        }
        while (l == 0);
    }
}