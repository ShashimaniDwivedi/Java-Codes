//enum (enumeration) is used when you have a fixed set of constant values.
//enum is a class
enum Status{
    //all four are object/Constants
    Running,Sleeping,Jumping,Excercise;
}

public class Enum1 {
    public static void main(String[] args) {
        Status[] ss=Status.values();
        for (Status s : ss) {
            System.out.println(s);  
        }
        
    }
}
