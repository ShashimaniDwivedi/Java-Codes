
@FunctionalInterface
interface car1 {
    void drive(int avg,int topSpeed);
}

public class lambda {
    public static void main(String[] args) {
        car1 obj=(avg,topSpeed)-> System.out.println("driver " +avg+":"+topSpeed);
        obj.drive(16,340);

    }
}

