import java.util.*;
public class operator {
    public static void main(String[] args) {
        int a=100, b=20;
        // 1. Arithmetic Operator
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a-b);
        System.out.println(a%b);
        System.out.println(a/b);
        // 2. Assignment Operator
        int x=15,y=10;
        x+=y; //x=x+y
        System.out.println("X + Y : "+ x);
        x-=y; //x=x-y
        System.out.println("X - Y : "+ x);
        // 3. Relational Operator
        System.out.println(x==y);
        System.out.println(x>y);
        System.out.println(x<y);
        System.out.println(x<=y);
        System.out.println(x>=y);
        System.out.println(x!=y);
        // 4. Logical Operator
        String usr="Shashi";
        int pwd=1234;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user name : ");
        String u=sc.next();
        System.out.println("Enter Password : ");
        int p=sc.nextInt();
        if(usr.equals(u) && pwd==p) System.out.printf("Welcome %s",usr);
        else System.out.println("Unauthorize access");
        //Short Circuiting
        boolean m=true,n=false;
        if (m && n )System.out.println("Short circuiting");
        else System.out.println("If first is false then no need to evaluate second expression");
        
        sc.close();

        // Bitwise operator
        int s=5,t=2;
        System.out.println(s&t);
        System.out.println(s|t);
        System.out.println(s^t);
        System.out.println(~s);
        
    }
    
}
