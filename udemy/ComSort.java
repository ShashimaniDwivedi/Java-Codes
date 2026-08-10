import java.util.*;
/* public class ComSort {
    public static void main(String[] args){
        List<String>names=new ArrayList<>();
        Comparator<String> c=new Comparator<String>() {
            public int compare(String a,String b){
                if(a.length()>b.length())return 1;
                return -1;
            }
        };
        names.add("Manas Dwivedi");
        names.add("Shashi Mani Dwivedi");
        names.add("Ravi");
        names.add("Ramesh");
        names.add("Manish");
        //Sort Alphabatically
        Collections.sort(names,c);
        System.out.println(names);
    }
}
 */

/* class Student implements Comparable<Student>{
    int age;
    String name;
    Student(){

    }
    Student(int age,String name){
    this.age=age;
    this.name=name;
    }
    public int compareTo(Student s1){
        return this.age>s1.age?1:-1;

    }
    //override because if not then give hashcode
    @Override
    public String toString(){
        return "Name : "+name+"  "+"Age : "+age;
    }
}

class ComSort{
    public static void main(String[] args) {
         List<Student>student=new ArrayList<>();
         student.add(new Student(21, "Manas"));
         student.add(new Student(23, "Ramesh"));
         student.add(new Student(17, "Vinod"));
         student.add(new Student(23, "Verru"));
         student.add(new Student(28, "Mahesh"));
        Collections.sort(student);
        for (Student s : student) {
            System.out.println(s);
        }
        

    }
} */


class Student{
    int age;
    String name;
    
    Student(int age,String name){
    this.age=age;
    this.name=name;
    }
    
    //override because if not then give hashcode
    @Override
    public String toString(){
        return "Name : "+name+"  "+"Age : "+age;
    }
}

class ComSort{
    public static void main(String[] args) {
         List<Student>student=new ArrayList<>();
         student.add(new Student(21, "Manas"));
         student.add(new Student(23, "Ramesh"));
         student.add(new Student(17, "Vinod"));
         student.add(new Student(23, "Verru"));
         student.add(new Student(28, "Mahesh"));


        Comparator<Student>cc=(s1,s2)-> (s1.age>s2.age)?1:-1;
        
        Collections.sort(student,cc);
        for (Student s : student) {
            System.out.println(s);
        }
        

    }
}