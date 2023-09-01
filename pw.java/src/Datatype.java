   public class  Datatype
 {
     public static void main(String[] args) {
         int m1,m2,m3,m4;
         m1=m2=m3=m4=10;

       /*
         int num1=12;
         int num2=5;
         float result=num1/num2;
       */

         System.out.println(m1+" "+m2+" "+" "+m3+" "+ m4);//concatenation
         int a=20;
         a*=5;//assignment operator
         System.out.println(a);
         int x=10;
         int y=20;
         int z=40;
         String result=(x<y)?/*"x is less than y"*/((x<z)?"x is less than z":"x is greater than z"):(y<z)?"y is less than z":"z is less than y";
         System.out.println(result);
         int val=1;
         switch(val)
         {
             case 1:System.out.println("case 1");
             break;
             case 2:System.out.println("case 2");
             break;
             case 3:System.out.println("case 3");
             break;
             default:System.out.println("DEFAULT");
         }
    }
}