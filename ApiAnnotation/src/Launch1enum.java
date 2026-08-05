

public class Launch1enum {
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

        Result.Pass.setMarks(50);
        int r=Result.Pass.getMarks();
        System.out.println(r);
    }
}

