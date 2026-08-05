public class jvOutput {
    public static void main(String[] args) {
        System.out.print("Hello It does not append new line");
        System.out.println("This append new line ");
        int x=10;
        System.out.format("Entered number is : %d\n",x);
        float num=3.1456f;
        System.out.format("value of number is %f\n",num);
        System.out.format("value of number is %.2f\n",num);
        //add space in front of number
        System.out.format("value of number is %5.2f\n",num);
        //add zero(0) in front of number
        System.out.format("value of number is %05.2f\n",num);

        // Place holder in Java
        String name = "Shashi";
        int age = 22;
        double cgpa = 8.56;

        System.out.printf("Name: %s\n", name);
        System.out.printf("Age: %d\n", age);
        System.out.printf("CGPA: %.2f\n", cgpa);
    }
    
}
