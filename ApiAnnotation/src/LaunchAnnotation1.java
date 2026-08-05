import java.lang.annotation.*;

//Custom Annotation
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPayer
{
    String country();
    //Agar value yahi par define Karna hai
    int age() default 34;
}

@CricketPayer(country = "INDIA")
class Virat
{

    private int inning;
    private int runs;

    public int getInning()
    {
        return inning;
    }

    public void setInning(int inning)
    {
        this.inning = inning;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }
}

public class LaunchAnnotation1 {
    public static void main(String[] args) {
        Virat v=new Virat();
        v.setInning(105);
        v.getInning();
        v.setRuns(2000);
        v.getRuns();
        System.out.println(v.getInning());
        System.out.println(v.getRuns());
        //information about Interface
        Class c=v.getClass();
        Annotation a=c.getAnnotation(CricketPayer.class);
        CricketPayer cp=(CricketPayer) a;
        String country=cp.country();
        int age= cp.age();
        System.out.println(country);
        System.out.println(age);

    }
}
