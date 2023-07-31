public class Main {
    public static void main(String[] args) {
       // String brand=new String("PW ");
        //brand=brand.concat("skill");
        //System.out.println(brand);
        //brand.concat("Lucknow");//non changeable
        //System.out.println(brand);
//       StringBuffer brand1=new StringBuffer("pw skill");
//       brand1.append(" Lucknow");
//        System.out.println(brand1);//changeable
//        String s1="PW Skill";
//        String s2= new String("PW Skill");
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));
        String s1="PW java skill ";
        String s2="pw"+"java";
        String s3="pw"+"java"+"lko";
        String s4=s1+s2;
        s1= s1.concat("Java ").concat("DSA ").concat("System");
        System.out.println(s1);
        System.out.println(s1);//String inbuilt method
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.length());//including spaces
        System.out.println(s1.charAt(8));
        System.out.println(s1.substring(3,8));//starting ,ending index
        System.out.println(s1.indexOf("a"));
        System.out.println(s1.indexOf("a",19));
       /* System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);*/
//        final int a=10;
//        a=20;
      //  System.out.println(a);
         String a="pw";
         a=a.concat("100").concat("99");
         System.out.println(a);

    }
}