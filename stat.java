public  class stat {
    static int age;
    //Recommended way to initialize static variable is static block
    static{
        age=10;
        System.out.println("Static block 1");
    }
    static{
        System.out.println("Static block 2");
    }
    static void disp(){
        System.out.println("Display method");
    }
    public static void main(String[] args) {
       System.out.println("Main Method"); 
       disp();
    }
    
}
