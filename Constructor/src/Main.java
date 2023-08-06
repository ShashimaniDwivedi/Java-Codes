class  Student
{
    private String name;
    private int age;

    Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    void disp()
    {
    System.out.println(this.name);
        System.out.println(this.age);
    }
//    public void setName(String manas)
//    {
//        this.name=name;
//    }
//    public void setAge(int age)
//    {
//    this.age=age;
//    }
//    public String getName()
//    {
//        return name;
//    }
//    public int getAge()
//    {
//        return age;
//    }
}

public class Main {
    public static void main(String[] args) {
        //call to constructor
        Student st=new Student("Manas",18);
        st.disp();
      //  st.setName("Manas");
        //st.setAge(18);
       // System.out.println();
    }
}