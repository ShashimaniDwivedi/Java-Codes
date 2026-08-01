import java.util.Scanner;

class swapNum {

  /*   int a = 10;
int b = 20;

a = a ^ b;
b = a ^ b;
a = a ^ b;
10
20
System.out.println("a = " + a);
System.out.println("b = " + b);
 */
    public void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;

        System.out.println("Swapped Number A = " + a);
        System.out.println("Swapped Number B = " + b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number A: ");
        int a = sc.nextInt();

        System.out.print("Enter Number B: ");
        int b = sc.nextInt();

        swapNum obj = new swapNum();
        obj.swap(a, b);

        sc.close();
    }
}