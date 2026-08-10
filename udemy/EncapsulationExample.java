class Student {

    // Private variables
    private String name;
    private int rollNo;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for rollNo
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // Getter for rollNo
    public int getRollNo() {
        return rollNo;
    }
}


public class EncapsulationExample {

    public static void main(String[] args) {

        Student s = new Student();

        // Setting values
        s.setName("Manas");
        s.setRollNo(21);

        // Getting values
        System.out.println("Name: " + s.getName());
        System.out.println("Roll No: " + s.getRollNo());
    }
}