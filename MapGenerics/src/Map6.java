import java.util.WeakHashMap;

class Employee {
    private String name;
    private int empId;

    public Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    @Override
    public String toString() {
        return name + " " + empId;
    }

    public void finalize() {
        System.out.println("Clean up work up garbage collector before deallocating memory from heap");
    }
}

public class Map6 {
    public static void main(String[] args) {
        Employee e = new Employee("Shashi", 722047);
        //Employee is eligible for garbage collection
        WeakHashMap hm = new WeakHashMap();
        hm.put(e, "shashi");
        System.out.println(hm);
        e = null;
        System.gc();//Invoking garbage collector
        System.out.println(hm);
        System.out.println("last line");
    }
}
