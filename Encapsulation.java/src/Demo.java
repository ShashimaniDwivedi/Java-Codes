 class student
{
 private int age;
  private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Demo {
    public static void main(String[] args) {
    student obj=new student();
    student obj1=new student();//making of object
        obj.setAge(18);
        obj1.setAge(25);
        obj.setName("Manas");
        obj1.setName("Shashi");
        //obj.show();
        //obj1.show();
        int stud1Age=obj.getAge();
        System.out.println(stud1Age);
    }
}
