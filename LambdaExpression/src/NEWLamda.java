@FunctionalInterface
interface School
{
    void Student();
}
public class NEWLamda {
    public static void main(String[] args) {
        School obj=()->System.out.println("Student is Playing Game...");
        obj.Student();

    }
}
