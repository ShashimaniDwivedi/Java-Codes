class Gen<T>
{
    T obj;
    public Gen(T obj)
    {
        this .obj=obj;
    }
    void disp()
    {
    System.out.println("The type of data is :"+obj.getClass().getName());
   //Printing type name(T)
    }
    public T getObj() {
        return obj;
    }
}
public class Generics {
    public static void main(String[] args) {
        Gen<Integer> g=new Gen<Integer>(10);
        g.disp();
       System.out.println( g.getObj());
       System.out.println("*************************");
        Gen<String> g1=new Gen<String>("Manas");
        g1.disp();
        System.out.println( g1.getObj());
       /* ArrayList<String> al=new <String>ArrayList();
        List<List> al1=new <List>ArrayList();
        Collection<Integer> al2=new <Integer>ArrayList();
        List<Integer> al3=new <Integer>ArrayList();
*/
    }
}
