
enum week
{
    Monday,Tuesday,Wednesday,Thursday,friday,saturday,Sunday
}

public class LaunchEnum {
    enum Result
    {
       Pass,Fail,NoResult;
       int marks;
        Result()
        {
            System.out.println("Constructor is called");
        }
        public void setMarks(int marks)
        {
            this.marks=marks;
        }
        int getMarks()
        {
            return marks;
        }
    }
    public static void main(String[] args) {
       /* week w = week.Monday;
        System.out.println(w);
        Result r=Result.Pass;
        System.out.println(r);
        int index=week.Monday.ordinal();
        System.out.println(index);
        week[]wr=week.values();
        for(week w1:wr )
        {
            System.out.println(w1+" : "+w1.ordinal());
        }*/
        Result.Pass.setMarks(50);
        int r=Result.Pass.getMarks();
        System.out.println(r);
    }
}
