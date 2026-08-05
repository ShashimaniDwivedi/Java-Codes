
class VarArgs
{
    public  int add(int ...arr)
    {
        int res=0;
        for(int a:arr)
        {
            res+=a;
        }
        return res;
    }
}public class AnonymousArray {
    public static int sum(int arr[])
    {  int result=0;
        for(int a:arr)
        {
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        //You can use Anonymous array only once
     int result=sum(new int[]{5,4,3,2});
     System.out.println("Using Anonymous array : "+result);
     VarArgs obj=new VarArgs();
     System.out.println("Using Varargs : "+obj.add(3,4,5,6,7,8));
     System.out.println("Using Varargs : "+obj.add(2,3));
    }
}

