public class prac
{
    public static int func (int n)
    {

        if (n == 1)
            return 1;

        return ( n * func(n-1) )/2;
    }

    public static void main(String args[])
    {
        System.out.print( func( 5 ) );
    }
}
