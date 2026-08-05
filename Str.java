public class Str {
    public static void main(String[] args) {
        //Allocate in SCP
        String a="manas";
        String b="manas";
        //Allocate in heap Duplicate allowed
        String x=new String("manas");
        String y=new String("Manas");
        //== check for refrence 
        System.out.println(a==b);//True
        System.out.println(x==y);//false
        //.equals check for content
        System.out.println(a.equals(b));//True
        System.out.println(x.equals(y));//False
        //String is immutable
        String s="PW";
        //on cancat new obj is created and we refrence to new obj
        s=s.concat("Skill");
        System.out.println(s);
        String s1="PwSkill";
        String s2=s1.concat("Java");
        String s3=new String("Java");
        String s4=s3.concat("PwSkill");
        System.out.println(s1+" "+s2+" "+s3+" "+s4);
        String str="Pw Skill Java";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.charAt(4));
        System.out.println(str.substring(5));
        System.out.println(str.contains("Pw"));
        System.out.println(str.endsWith("a"));
        System.out.println(str.substring(3,8));

        //Mutable string 
        StringBuffer st=new StringBuffer("PW");
        //After appending new obj is not created
        st.append("Skill");
        System.out.println(st);
        //final keyword
        final int e=10;
        // e=20;
        final StringBuffer se=new StringBuffer("Virat");
        se.append("Kohli");
        // In final we can't assign to new obj
        // se=new StringBuffer("MSD");
    

    }
}
