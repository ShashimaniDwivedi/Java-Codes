import java.time.LocalDate;
import java.time.LocalTime;

public class Launch2 {
    public static void main(String[] args) {
       LocalDate date= LocalDate.now();
        LocalTime time=LocalTime.now();
       System.out.println(date);
       int day=date.getDayOfMonth();
       int day1=date.getMonthValue();
       int year= date.getYear();
       System.out.println(day1);
       System.out.println(day);
       System.out.println(year);
       System.out.println(time);
       System.out.println(day+ "/" +day1+ "/"+year);
       int ti=time.getMinute();
       System.out.println(ti);
    }
}
