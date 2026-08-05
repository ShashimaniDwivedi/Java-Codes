public class LaunchEnum2 {
    enum Result{
        PASS,FAIL,NR,ABSENT;
        int marks;
        Result()
        {
            System.out.println("Constructor is called");
        }
       public void setMark(int marks)
        {
            this.marks=marks;
        }
       public int getMarks(){
            return marks;
        }
    }
    public static void main(String[] args) {
     Result r=Result.PASS;
     switch(r)
     {
         case PASS:System.out.println("PASSED...");
         break;
         case FAIL:System.out.println("FAIL...");
         break;
         case NR:System.out.println("NO Result...");
         break;
         default:System.out.println("Absent");
     }
    }
}
