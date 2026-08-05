public class Main {
    public static void main(String[] args) {
        System.out.println("Main method");
        main("Manas", 18);
        Main m=new Main();
        m.main(16);
    }

    public static void main(String str, int i) {
        System.out.println("Main method with 2 arguments");
    }

    public  void main(int id) {
        System.out.println("Main method with 1 argument");
    }
}
