interface car{
    void drive();
}

public class practice2 {
    public static void main(String[] args) {
        //In this ques object of interface is not made rather object of anonymous inner class is made
        car c =new car()
        {
            public void drive()
            {
                System.out.println("Driving...");
            }
        };
        c.drive();
        car c1=()->System.out.println("Driving at 80km/h");
        c1.drive();
    }
}
