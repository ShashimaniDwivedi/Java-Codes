
class Human//super,base,parent class//Base class single inheritance
{
    protected String name="Manas";
    int age;

    Human() {
        System.out.println("Human class constructor");
    }

    void sleep() {
        age = 18;
        System.out.println("Human need good sleep");
        System.out.println(age);

    }
}

class Student extends Human//sub,derived,child class
{
    //linking classes using extend keyword
    //public Student()
   // {
        //super();
    //}
    //Due to this parent class constructor is called
    void disp()
    {
        System.out.println("The age is :" + age);
        System.out.println(name);

    }

}

class inheritance {
    public static void main(String[] args) {
        Student st = new Student();
        st.sleep();
        st.disp();
    }


}
