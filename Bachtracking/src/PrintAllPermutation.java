import java.util.Scanner;

public class PrintAllPermutation {
    public static String swap(String str,int i,int j)
    {
        char[] chararray=str.toCharArray();
        char temp=chararray[i];
        chararray[i]=chararray[j];
        chararray[j]=temp;
        return String.valueOf(chararray);
    }

    public static void permute(String str,int l,int r)
    {
     if(l==r)
     {
         //Not terminating here because it give on string only
         System.out.println(str);
     }
     else {
         for(int i=l;i<=r;i++)
         {
          str=swap(str,l,i);
          permute(str,l+1,r);
          //backtracking
             str=swap(str,l,i);
         }
     }
    }
    public static void main(String[] args) {
        System.out.println("Enter String : ");
       Scanner sc=new Scanner(System.in);
       String str1=sc.next();
       int n=str1.length();
       System.out.println("For the String "+str1+" Permutations are : ");
       permute(str1,0,n-1);
    }
}
