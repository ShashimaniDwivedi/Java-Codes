public class typeCasting {
    public static void main(String[] args) {
        // implicit type casting 
        int a =10;
        double b=a;
        System.out.println(b);
        // exmplicit type casting 
        double x=45.0;
        int y=(int)x;
        System.out.println(y);
        //Truncation round to zero
        int n1=10,n2=5;
        float res=n1/n2;
        //after decimal value is vanished or truncated
        System.out.println(res);

    }
}
