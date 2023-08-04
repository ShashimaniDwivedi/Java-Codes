import java.util.*;

class Student {
    private
    String name;
    int age;
    String city;

    public Student(String name, int age, String city)
    {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    public String getcity() {
        return city;
    }

    public int getage() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name +" "+age +" "+city;//writing this to override toString method
    }
}

public class Map4 {
    public static void main(String[] args) {
        Student st=new Student("Raj",18,"Lucknow");
        Student st1=new Student("Rakul",16,"Bangluru");
        Student st2=new Student("Ram",17,"Kanpur");
        Map map = new HashMap();
        map.put(1,st);
        map.put(2,st1);
        map.put(3,st2);
        System.out.println((map));

        Set keyset=map.keySet();
        Iterator itr=keyset.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        Collection value=map.values();
        Iterator itr1=value.iterator();
        while(itr1.hasNext())
        {
            System.out.println(itr1.next());
        }
        Set entry=map.entrySet();
        Iterator itr2= entry.iterator();
        while(itr2.hasNext())
        {
            Map.Entry a=(Map.Entry) itr2.next();
            System.out.println(a.getKey()+" : "+a.getValue());
        }
        TreeMap tm =new TreeMap();

        tm.put(3,"RAM");
        tm.put(2,"Paul");
        tm.put(1,"tim");
        System.out.println(tm);

    }
}
