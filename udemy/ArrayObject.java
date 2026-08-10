class Student{
    String name;
    int roll_no;
}

public class ArrayObject {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        s1.name="Manas";
        s1.roll_no=21;
        s2.name="Shashi";
        s2.roll_no=11;
        s3.name="Ravi";
        s3.roll_no=42;

        Student st[]=new Student[3];
        st[0]=s1;
        st[1]=s2;
        st[2]=s3;

        for(int i=0;i<st.length;i++){
            System.out.println(st[i].name+":"+st[i].roll_no);
        }
    }
}
