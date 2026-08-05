import java.util.ArrayList;
import java.util.Scanner;

class StackDynamic {
  ArrayList<Integer> al = new ArrayList<>();

  void push() {
    System.out.print("Enter Element : ");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    al.add(x);
  }

  void pushIndex() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Index and Element to be added: : ");
    int i = sc.nextInt();
    int val = sc.nextInt();
    al.add(i, val);
  }

  void pop() {
    if (al.isEmpty()) {
      System.out.println("Underflow");
    }
    int res = al.get(al.size() - 1);
    al.remove(al.size() - 1);
    System.out.println("Deleted item is : " + res);
  }

  void disp() {
    System.out.print("Element in Stack are : ");
    for (int i : al) {
      System.out.print(i + " ");
    }
  }

  void peek() {
    System.out.println("Top element of Stack is : " + al.get(al.size() - 1));
  }

  void size() {
    System.out.println("Stack size is : " + al.size());
  }

  void Empty() {
    System.out.println("Stack is Empty : " + al.isEmpty());
  }

  public static void main(String[] args) {
    int l;
    StackDynamic s = new StackDynamic();
    Scanner sc = new Scanner(System.in);
    do {
      System.out.println("*****MainMenu*****");
      System.out.println("1:PUSH");
      System.out.println("2:POP");
      System.out.println("3:DISPLAY");
      System.out.println("4:EMPTY");
      System.out.println("5:SIZE");
      System.out.println("6:PEEK");
      System.out.println("7:Push At any Index");
      System.out.println("Enter choice : ");
      int ch = sc.nextInt();
      switch (ch) {
        case 1:
          s.push();
          break;
        case 2:
          s.pop();
          break;
        case 3:
          s.disp();
          break;
        case 4:
          s.Empty();
          break;
        case 5:
          s.size();
          break;
        case 6:
          s.peek();
          break;
        case 7:
          s.pushIndex();
          break;
      }
      System.out.println("Enter 0 to go back to main menu");
      l = sc.nextInt();
    } while (l == 0);
  }
}