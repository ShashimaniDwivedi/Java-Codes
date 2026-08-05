public class VarArgs {
   /* public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }*/
    static int sum(int ...arr)//var args take multiple arguments
    { int res=0;
      //  int[]arr behave like this
        for(int a :arr)
        {
            res+=a;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("The sum is : "+sum());
        System.out.println("The sum is : "+sum(4,5));
        System.out.println("The sum is : "+sum(4,5,6));
        System.out.println("The sum is : " + sum(4, 5,7));
    }
}
